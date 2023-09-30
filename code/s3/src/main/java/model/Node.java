package model;

import java.io.IOException;
import java.util.random.RandomGenerator;


import com.java.stubs.CommanderServiceGrpc;
import com.java.stubs.InterfaceServiceGrpc;
import com.java.stubs.Services.Empty;
import com.java.stubs.Services.MissileAlert;
import com.java.stubs.Services.Status;
import com.java.stubs.Services.current_status;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import main.ServerApp;
import rpcservices.CommanderService;
import rpcservices.InterfaceService;
import java.lang.Math;


public class Node {
	
	private final static int id = 3;
	private int role ;
	private int matrix;
	private int Time ;
	private static Status status;
	private int port;
	private Server server;
	private ManagedChannel serverChannel;
	private static int x =Math.abs(RandomGenerator.getDefault().nextInt());
	private static int y =Math.abs(RandomGenerator.getDefault().nextInt());
	private static int speed=Math.abs(RandomGenerator.getDefault().nextInt())%4+1;
	private static int direction = RandomGenerator.getDefault().nextInt()%6+1;
	private int[] node_list = new int[9] ;
	private Status[] soldier_info= new Status[10];
	private Missile missile_info = new Missile();
	private ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9090")
            .usePlaintext()
            .build();
	private InterfaceServiceGrpc.InterfaceServiceBlockingStub Interfacestub = InterfaceServiceGrpc.newBlockingStub(channel);
	private static Status.Builder statusbuilder ;
	
	public static Status getStatus() {
		return status;
	}
	public static void setStatus(Status status) {
		Node.status = status;
	}
	public int getMatrix() {
		return matrix;
	}
	public void setMatrix(int matrix) {
		this.matrix = matrix;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}

	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
	public ManagedChannel getServerChannel() {
		return serverChannel;
	}
	public void setServerChannel(ManagedChannel serverChannel) {
		this.serverChannel = serverChannel;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public Missile getMissile_info() {
		return missile_info;
	}
	public void setMissile_info(Missile missile_info) {
		this.missile_info = missile_info;
	}
	public static int getId() {
		return id;
	}
	public void setTime(int time) {
		Time = time;
	}
	public int getTime() {
		return Time;
	}
	public int[] getNode_list() {
		return node_list;
	}
	
	public void startServer(int port) throws IOException, InterruptedException {
		if(this.server!=null)
			stopServer(this.server);
		
		this.server = ServerBuilder.forPort(port).addService(new CommanderService()).addService(new InterfaceService()).build();
		this.server.start();
		System.out.println("server started at " + server.getPort());
		//this.server.awaitTermination();
	}
	
	public void stopServer(Server server) {
		
		this.server.shutdownNow();
	}
	
	public void updateServerChannel(Server server) {
		this.serverChannel = ManagedChannelBuilder.forAddress("localhost",server.getPort()
				).usePlaintext().build();
	}
	
	public void serverRoutine(int T) {
		boolean broadcast_complete;
		
		if(status==null) {
			statusBuilder();
			
		}
		this.soldier_info[id] = status;
		this.Time = T;
		
		for(int i  =0 ; i< T ; i++) {
			
            
            
            // Create and send a message to the peer
             MissileAlert missile = Interfacestub.missileInfo(null);
             
             if(this.aliveCheck(missile)==false) {
            	 //this.node_list[id]=1;
            	 this.changeCommander(missile,this.Time);
            	 break;
            	 
             }
             else
            	 broadcast_complete=this.broadcast(missile);
            
             this.Time--;
             
            
		}
		// Close the channel
        channel.shutdown();
        
	}
	
	
	public boolean broadcast(MissileAlert missile){
		
		for (int i = 1; i < 10; i++) {
			if(i!=id) {
				String target = "localhost:500" + i; // Adjust the target address as needed
				try {
	            ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
	                    .usePlaintext()
	                    .build();
	            CommanderServiceGrpc.CommanderServiceBlockingStub Commanderstub = CommanderServiceGrpc.newBlockingStub(channel);
	         // Create and send a message to the peer
	            Status status = Commanderstub.missileApproachingSubscription(missile);
	            //System.out.print(status);
	            this.soldier_info[i] = status;
//	            if(status.getHit()==true)
//	            	this.node_list[i-1] =1;
	
	            // Close the channel
	            channel.shutdown();
				}
				catch(Exception e)
				{
					this.node_list[i-1]=1;
				}
            }
			
		}
		Empty empty;
		Status s;
        for(int j =1;j<10;j++) {
        	if(this.soldier_info[j]!=null) {
        		System.out.print(this.soldier_info[j]);
        		s = this.soldier_info[j];
                empty = Interfacestub.sendInfo(s); 
        	}
       	 
        }
        empty =Interfacestub.printLayout(null);
		return true;
	}
	
	
	
	public ManagedChannel getChannel() {
		return channel;
	}
	public void setChannel(ManagedChannel channel) {
		this.channel = channel;
	}
	public InterfaceServiceGrpc.InterfaceServiceBlockingStub getInterfacestub() {
		return Interfacestub;
	}
	public void setInterfacestub(InterfaceServiceGrpc.InterfaceServiceBlockingStub interfacestub) {
		Interfacestub = interfacestub;
	}
	public void setNode_list(int[] node_list) {
		this.node_list = node_list;
	}
	
	
	
	public boolean aliveCheck(MissileAlert missile) {
		if(status == null ) {
			statusBuilder();
		}
		if(Math.abs(status.getX()-missile.getMissileX())>=missile.getType()||Math.abs(status.getY()-missile.getMissileY())>=missile.getType()){
			return true;
		}
		int d =Math.min( Math.abs(missile.getMissileX()-status.getX()),Math.abs(missile.getMissileY()-status.getY()));
		if(status.getSpeed()>=missile.getType()-d) {
			return take_shelter(missile);
			
		}
		
		return false;
	}
	
	
	
	public static Status.Builder getStatusbuilder() {
		return statusbuilder;
	}
	public static void setStatusbuilder(Status.Builder statusbuilder) {
		Node.statusbuilder = statusbuilder;
	}
	public void changeCommander(MissileAlert missile,int timeLeft) {
		if(status==null) {
        	statusBuilder();
        }
		
		status = statusbuilder.setHit(false).build();
		this.soldier_info[id]= status;
		Empty empty;
		Status s;
		ManagedChannel infochannel = ManagedChannelBuilder.forAddress("localhost",9090)
                .usePlaintext()
                .build();
	
	    InterfaceServiceGrpc.InterfaceServiceBlockingStub infostub = InterfaceServiceGrpc.newBlockingStub(infochannel);
        for(int j =1;j<10;j++) {
        	if(this.soldier_info[j]!=null) {
        		System.out.print(this.soldier_info[j]);
        		s = this.soldier_info[j];
                empty = infostub.sendInfo(s); 
        	}
       	 
        }
        infochannel.shutdown();
        
		
		int i;
		for( i = 1 ;i<10;i++) {
			if(i!=id) {
				try {
					String target = "localhost:500" + i; // Adjust the target address as needed
					
			        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
			                .usePlaintext()
			                .build();
			        
			   	   	CommanderServiceGrpc.CommanderServiceBlockingStub commanderStub =CommanderServiceGrpc.newBlockingStub(channel);
			   	    System.out.println(this.soldier_info[id]);
			   	   	current_status cstatus = current_status.newBuilder().setPrevious(Node.status).setMissile(missile).setTimeLeft(timeLeft).build();
			   	   	empty = commanderStub.commanderChange(cstatus);
			   	   	channel.shutdown();
			   	   	break;
		   	   	}
				catch(Exception e){
		   	   		
		   	   	}
			}
		}
			
			if(i == 10) {
				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090)
		                .usePlaintext()
		                .build();
			
			    InterfaceServiceGrpc.InterfaceServiceBlockingStub stub = InterfaceServiceGrpc.newBlockingStub(channel);
			   	//CommanderServiceGrpc.CommanderServiceBlockingStub commanderStub =CommanderServiceGrpc.newBlockingStub(channel);
			   	stub.gameOver(null);
			   	channel.shutdown();
			   	this.stopServer(this.server);
			   	return;
			}
		
		this.stopServer(this.server);
	}
	
	
	
	public Status[] getSoldier_info() {
		return soldier_info;
	}
	public void setSoldier_info(Status[] soldier_info) {
		this.soldier_info = soldier_info;
	}
	
	public void statusBuilder() {
		status = Status.newBuilder().setHit(true)
				.setDirection(this.getDirection())
				.setSpeed(this.getSpeed())
				.setX(Math.abs(this.getX()%ServerApp.getMyNode().getMatrix()))
				.setY(Math.abs(this.getY()%ServerApp.getMyNode().getMatrix()))
				.setId(id)
				.build();
		statusbuilder = status.toBuilder();
		return ;
	}
	public boolean take_shelter(MissileAlert missile){
		int k;
		if(status == null) {
			statusBuilder();
		}
//		Empty empty;
//		Status s;
//		ManagedChannel infochannel = ManagedChannelBuilder.forAddress("localhost",9090)
//                .usePlaintext()
//                .build();
//	
//	    InterfaceServiceGrpc.InterfaceServiceBlockingStub infostub = InterfaceServiceGrpc.newBlockingStub(infochannel);
//        s = statusbuilder.setHit(false).build();
//        empty = infostub.sendInfo(s); 
//        infochannel.shutdown();
		if(Math.abs(status.getX()-missile.getMissileX())>=Math.abs(status.getY()-missile.getMissileY())) {
			if(status.getY()>=missile.getMissileY()) {
				status= statusbuilder.setY((missile.getMissileY()+missile.getType())%ServerApp.getMyNode().getMatrix()).build();
			}
			else {
				k=(missile.getMissileY()-missile.getType())%ServerApp.getMyNode().getMatrix();
				if(k<0) {
					status = statusbuilder.setY(ServerApp.getMyNode().getMatrix()+k).build();
				}
				else
				status=statusbuilder.setY(k).build();
			}
		}
		else {
			if(status.getX()>=missile.getMissileX()) {
				status =statusbuilder.setX((missile.getMissileX()+missile.getType())%ServerApp.getMyNode().getMatrix()).build();
			}
			else {
				k=(missile.getMissileX()-missile.getType())%ServerApp.getMyNode().getMatrix();
				if(k<0) {
					status = statusbuilder.setX(ServerApp.getMyNode().getMatrix()+k).build();
				}
				else
					status = statusbuilder.setX(k).build();
			}
		}
		status= statusbuilder.setHit(true).build();
		soldier_info[id] = status;
		return true;
	}
	



}

