package week3.day2w3;

public class Connection extends MySqlConnection{

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Query Executed successfully");
		
	}

	public static void main(String[] args) {
		Connection con = new Connection();
		con.connect();
		con.disconnect();
		con.executeQuery();
		con.executeUpdate();
	}
}
