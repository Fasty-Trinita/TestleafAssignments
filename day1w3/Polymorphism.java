package week3.day1w3;

public class Polymorphism {
	public void reportSend(String Message, String Status) {
		System.out.println("Message :" +Message+" Status :"+Status);
	}
	
	public void reportSend(String Message, String Status, boolean snap ) {
		System.out.println("Message :" +Message+" Status :"+Status+ " Boolean :"+snap);
	}
	
	public static void main(String[] args) {
		Polymorphism poly = new Polymorphism();
		poly.reportSend("Id", "Success");
		poly.reportSend("Name", "Failed", false);
	}
	
	
}
