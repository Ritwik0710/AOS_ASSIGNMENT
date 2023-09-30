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
import io.grpc.stub.StreamObserver;
import main.ServerApp;


public class InterfaceService extends InterfaceServiceImplBase{
	
	private static Status status;
	
	private static int[][] a = new int[ServerApp.getMyNode().getMatrix()][ServerApp.getMyNode().getMatrix()];
	
    static {Arrays.fill(a, 0);}
    
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

	@Override
	public void inputBroadcast(UserInput request, StreamObserver<Broadcast_Alert_recieved> responseObserver) {
		// TODO Auto-generated method stub
		//ServerApp.getMyNode().setTime(request.getTime());
		Broadcast_Alert_recieved recieved = Broadcast_Alert_recieved.newBuilder().setRecieved(true).build(); 
		
		ServerApp.getMyNode().setMatrix(request.getMatrix());
		ServerApp.getMyNode().setX( ServerApp.getMyNode().getX()%request.getMatrix());
		ServerApp.getMyNode().setY( ServerApp.getMyNode().getY()%request.getMatrix());
		ServerApp.getMyNode().setTime(request.getTime());
		responseObserver.onNext(recieved);
		responseObserver.onCompleted();
//		if(ServerApp.getMyNode().getId()==request.getCommander()) {
//			ServerApp.getMyNode().serverRoutine(request.getTime());
//		}
		
		//super.inputBroadcast(request, responseObserver);
	}

	@Override
	public void printLayout(Empty request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		for(int i =0 ;i<ServerApp.getMyNode().getMatrix();i++) {
			for(int j =0 ;j<ServerApp.getMyNode().getMatrix();j++) {
					System.out.print(a[i][j]);

			}
			System.out.println();
		}
		Arrays.fill(a, 0);
	}

	@Override
	public void status(Soldier_Id request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.status(request, responseObserver);
	}
	@Override
	public void sendInfo(Status request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		
		
		
		status = request;
		if(status.getHit()==true)
			a[status.getX()][status.getY()] = status.getId();
		else
			a[status.getX()][status.getY()] = 0;
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		//super.sendInfo(request, responseObserver);
	}
	@Override
	public void gameOver(Empty request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		System.out.print("No Soldiers left,Game Over!!!");
	}
	@Override
	public void startCommander(Empty request, StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		responseObserver.onNext(null);
		responseObserver.onCompleted();
		ServerApp.getMyNode().serverRoutine(ServerApp.getMyNode().getTime());
		//super.startCommander(request, responseObserver);
	}
}
