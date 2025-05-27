package week3.day2w3;

public interface DatabseConnection {
	//unimplemented methods
	public void connect();
	
	//implemented methods
	default void disconnect() {
		System.out.println("Network got disconnected");
	}
	
	default void executeUpdate() {
		System.out.println("Update Excecuted successfully");
	}

}
