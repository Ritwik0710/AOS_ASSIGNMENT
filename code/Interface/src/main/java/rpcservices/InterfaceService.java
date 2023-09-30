package rpcservices;

import java.util.Arrays;

import java.util.Scanner;



import com.java.stubs.InterfaceServiceGrpc.InterfaceServiceImplBase;
import com.java.stubs.Services.Broadcast_Alert_recieved;
import com.java.stubs.Services.Empty;
import com.java.stubs.Services.MissileAlert;
import com.java.stubs.Services.Soldier_Id;
import com.java.stubs.Services.Status;
import com.java.stubs.Services.UserInput;

import input.InterfaceApp;
import io.grpc.stub.StreamObserver;


public class InterfaceService extends InterfaceServiceImplBase{
	
	private static Status status[] =new Status[10];
	private static int matrix ;
	private static int[][] a ;
	private static int soldiersLeft = 0;
	
    //static {Arrays.fill(a, 0);}
    
	@Override
	public void missileInfo(Empty request, StreamObserver<MissileAlert> responseObserver) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Set Missile x, y, radius:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		MissileAlert missile = MissileAlert.newBuilder().setMissileX(x).setMissileY(y).setType(r).build();
		responseObserver.onNext(missile);
		responseObserver.onCompleted();
		
		//super.missileInfo(request, responseObserver);
	}

//	@Override
//	public void inputBroadcast(UserInput request, StreamObserver<Broadcast_Alert_recieved> responseObserver) {
//		// TODO Auto-generated method stub
//		//ServerApp.getMyNode().setTime(request.getTime());
//		Broadcast_Alert_recieved recieved = Broadcast_Alert_recieved.newBuilder().setRecieved(true).build(); 
//		responseObserver.onNext(recieved);
//		responseObserver.onCompleted();
//		ServerApp.getMyNode().setMatrix(request.getMatrix());
//		if(ServerApp.getMyNode().getId()==request.getCommander()) {
//			ServerApp.getMyNode().serverRoutine(request.getTime());
//		}
//		//super.inputBroadcast(request, responseObserver);
//	}

	@Override
	public void printLayout(Empty request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		
		for(int i =0 ;i<matrix;i++) {
			for(int j =0 ;j<matrix;j++) {
					System.out.print(a[i][j]);

			}
			System.out.println();
		}
		for(int i=1;i<10;i++) {
			if(status[i].getHit()==true) {
				soldiersLeft++;
			}
			System.out.println(status[i]);
		}
		System.out.println("soldiers left: "+ soldiersLeft);
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		for(int i =0 ;i<matrix;i++) {
			for(int j =0 ;j<matrix;j++) {
					a[i][j]=0;

			}
		}
		soldiersLeft =0 ;
	}


	public static int getMatrix() {
		return matrix;
	}

	public static void setMatrix(int matrix) {
		InterfaceService.matrix = matrix;
	}

	public static int[][] getA() {
		return a;
	}

	public static void setA(int[][] a) {
		InterfaceService.a = a;
	}
	

	@Override
	public void status(Soldier_Id request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.status(request, responseObserver);
	}
	@Override
	public void sendInfo(Status request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		
		System.out.println("changes decteted " + request.getX() +" "+ request.getY()+" "+request.getHit());
		
		status[request.getId()] = request;
		//System.out.println(status);
		if(request.getHit()==true) {
			a[request.getX()][request.getY()] = request.getId();
		
		}
		else
			a[request.getX()][request.getY()] = 0;
		//super.sendInfo(request, responseObserver);
		responseObserver.onNext(null);
		responseObserver.onCompleted();
	}
	@Override
	public void gameOver(Empty request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		System.out.print("No Soldiers left,Game Over!!!");
		InterfaceApp.server.shutdown();
	}
}
