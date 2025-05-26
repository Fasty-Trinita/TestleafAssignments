package week3.day1w3;

public class SubTestData extends SuperTestData{
	public void enterUsername(String Username) {
		System.out.println("UserName: "+Username);
	}
	
	public void enterPassword(String Password) {
		System.out.println("Password: "+Password);
	}
	
	public static void main(String[] args) {
		SubTestData subData = new SubTestData();
		subData.enterUsername("Fasty");
		subData.enterPassword("Fasty@9699");
		subData.enterCredentials("Fasty Trinita");
		subData.navigateToHomePage();
	}

}
