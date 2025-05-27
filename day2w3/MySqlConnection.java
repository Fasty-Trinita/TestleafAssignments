package week3.day2w3;

public abstract class MySqlConnection implements DatabseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		DatabseConnection.super.disconnect();
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		DatabseConnection.super.executeUpdate();
	}
	
	public abstract void executeQuery();

}
