package main;



import java.io.IOException;


import model.Node;


//initialize all clients and servers with hashmap 
public class ServerApp {
	
		private static Node myNode = new Node(); 
		
		public static Node getMyNode() {
			return myNode;
		}
		public static void setMyNode(Node myNode) {
			ServerApp.myNode = myNode;
		}
		
		public static void main(String[] args) throws IOException,InterruptedException{
			
			myNode.startServer(5000+myNode.getId());
			myNode.getServer().awaitTermination();
			
		}
}
				
			
		
	


