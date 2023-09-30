package rpcservices;



import java.io.IOException;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.stubs.InterfaceServiceGrpc;
import com.java.stubs.CommanderServiceGrpc.CommanderServiceImplBase;
import com.java.stubs.Services.Empty;
import com.java.stubs.Services.MissileAlert;
import com.java.stubs.Services.current_status;
import com.java.stubs.Services.dead_or_alive;
import com.java.stubs.Services.Status;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import main.ServerApp;
import model.Missile;
import model.Node;

public class CommanderService extends CommanderServiceImplBase{



	Node node = ServerApp.getMyNode();
	@Override
	public void missileApproachingSubscription(MissileAlert request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println(node.getMatrix());
		Status status;
		if(Node.getStatus() == null) {
			node.statusBuilder();
		}
		
		if(node.aliveCheck(request)==true)
			status =Node.getStatus();
		else {
			status =Node.getStatusbuilder().setHit(false).build();
			Node.setStatus(status);
		}
		
		System.out.print(status.getId()+" "+status);
		responseObserver.onNext(status);
		responseObserver.onCompleted();
		if(status.getHit()==false) {
			node.stopServer(node.getServer());
		}
		//super.missileApproachingSubscription(request, responseObserver);
	}

	@Override
	public void commanderChange(current_status request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		
//		int nodes = request.getNodes();
//		for(int i=0 ;i<9;i++) {
//			node.getNode_list()[i]= nodes%10;
//			nodes= nodes/10;
//		}
		boolean broadcast =false ;
		System.out.print("new commander"+node.getId());
		if(node.aliveCheck(request.getMissile())==true) {
			ManagedChannel infochannel = ManagedChannelBuilder.forAddress("localhost",9090)
	                .usePlaintext()
	                .build();
		
		    InterfaceServiceGrpc.InterfaceServiceBlockingStub infostub = InterfaceServiceGrpc.newBlockingStub(infochannel);
			infostub.sendInfo(request.getPrevious());
			infochannel.shutdown();
			responseObserver.onNext(null);
			responseObserver.onCompleted();
			broadcast = node.broadcast(request.getMissile());
			
			node.serverRoutine(request.getTimeLeft());
			
			
		}else 
		{	
			ManagedChannel infochannel = ManagedChannelBuilder.forAddress("localhost",9090)
	                .usePlaintext()
	                .build();
		
		    InterfaceServiceGrpc.InterfaceServiceBlockingStub infostub = InterfaceServiceGrpc.newBlockingStub(infochannel);
			infostub.sendInfo(request.getPrevious());
			infochannel.shutdown();
			responseObserver.onNext(null);
			responseObserver.onCompleted();
			//request=current_status.newBuilder().setPrevious(node.getSoldier_info()[node.getId()]).build();
			node.changeCommander(request.getMissile(), request.getTimeLeft());
			//node.stopServer(node.getServer());
		}
		//super.commanderChange(request, responseObserver);
	}



}
