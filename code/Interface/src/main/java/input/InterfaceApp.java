package input;

import java.io.IOException;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.java.stubs.InterfaceServiceGrpc;
import com.java.stubs.Services.Broadcast_Alert_recieved;
import com.java.stubs.Services.Empty;
import com.java.stubs.Services.UserInput;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import rpcservices.InterfaceService;


public class InterfaceApp {
	public static Server server = ServerBuilder.forPort(9090).addService(new InterfaceService()).build();
	public static void main(String[] args) throws IOException,InterruptedException{
		
		server.start();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Set matrix Size :");
		int m =scanner.nextInt();
		InterfaceService.setMatrix(m);
		InterfaceService.setA(new int[m][m]) ;
		
		System.out.println("Set Time :");
		int t =scanner.nextInt();
		
		System.out.println("Set Commander 1 to 9 :");
		int c =scanner.nextInt()%10;
		
		System.out.println("ok");
		
		int nodes =9;
		Broadcast_Alert_recieved recieved = Broadcast_Alert_recieved.newBuilder().setRecieved(false).build();
		ManagedChannel channel = null;
		for (int i = 1; i <= nodes; i++) {
			
			String target = "localhost:500" + i; // Adjust the target address as needed
			try {
            channel = ManagedChannelBuilder.forTarget(target)
                    .usePlaintext()
                    .build();
            
            InterfaceServiceGrpc.InterfaceServiceBlockingStub stub = InterfaceServiceGrpc.newBlockingStub(channel);

            // Create and send a message to the peer
            UserInput input = UserInput.newBuilder().setCommander(c).setMatrix(m).setTime(t).build();
            recieved = stub.inputBroadcast(input);
            System.out.print(recieved);
            channel.shutdown();
            
			}
			catch(Exception e) {
				
			}
		
		}  

		 // Close the channel
		Empty empty;
		String target = "localhost:500" + c; 
        ManagedChannel commanderchannel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();
        
        InterfaceServiceGrpc.InterfaceServiceBlockingStub stub = InterfaceServiceGrpc.newBlockingStub(commanderchannel);
        empty = stub.startCommander(null);
        commanderchannel.shutdown();
        
		server.awaitTermination();
	}	
}
