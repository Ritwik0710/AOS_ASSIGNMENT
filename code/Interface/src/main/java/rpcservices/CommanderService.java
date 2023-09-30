//package rpcservices;
//
//
//
//import java.io.IOException;
//
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.java.stubs.CommanderServiceGrpc.CommanderServiceImplBase;
//import com.java.stubs.Services.Empty;
//import com.java.stubs.Services.MissileAlert;
//import com.java.stubs.Services.current_status;
//import com.java.stubs.Services.dead_or_alive;
//import com.java.stubs.Services.Status;
//import io.grpc.stub.StreamObserver;
//import main.ServerApp;
//import model.Missile;
//import model.Node;
//
//public class CommanderService extends CommanderServiceImplBase{
//
//	@Override
//	public void gameOver(Empty request, StreamObserver<Empty> responseObserver) {
//		// TODO Auto-generated method stub
//		responseObserver.onNext(null);
//		responseObserver.onCompleted();
//		System.out.print("No Soldiers left,Game Over!!!");
//		super.gameOver(request, responseObserver);
//	}
//
//	Node node = ServerApp.getMyNode();
//	@Override
//	public void missileApproachingSubscription(MissileAlert request, StreamObserver<Status> responseObserver) {
//		// TODO Auto-generated method stub
//		
//		
//		Status status= Status.newBuilder().setDirection(node.getDirection())
//				.setSpeed(node.getSpeed()).setX(node.getX())
//				.setY(node.getY()).setHit(node.aliveCheck(request)).build();
//		
//		responseObserver.onNext(status);
//		responseObserver.onCompleted();
//		//super.missileApproachingSubscription(request, responseObserver);
//	}
//
//	@Override
//	public void commanderChange(current_status request, StreamObserver<Empty> responseObserver) {
//		// TODO Auto-generated method stub
//		responseObserver.onNext(null);
//		responseObserver.onCompleted();
//		int nodes = request.getNodes();
//		for(int i=0 ;i<9;i++) {
//			node.getNode_list()[i]= nodes%10;
//			nodes= nodes/10;
//		}
//			
//		node.broadcast(request.getMissile());
//		node.serverRoutine(request.getTimeLeft());
//		
//		//super.commanderChange(request, responseObserver);
//	}
//
//
//
//}
