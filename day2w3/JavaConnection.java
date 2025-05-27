package week3.day2w3;

public abstract class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
	
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

	
}
