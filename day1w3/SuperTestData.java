package week3.day1w3;

public class SuperTestData {
	public void enterCredentials(String Login) {
		System.out.println("Enter Credetials :"+Login);
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to Home Page");
	}
	
	public static void main(String[] args) {
		SuperTestData std = new SuperTestData();
		std.enterCredentials("Successful");
		std.navigateToHomePage();
	}

}
