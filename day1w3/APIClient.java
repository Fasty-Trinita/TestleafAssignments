package week3.day1w3;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Print: "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Print: "+endpoint+ " " +requestBody+ " " +requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("SFTP");
		api.sendRequest("Rest API,", "GET,", false);
	}
}
