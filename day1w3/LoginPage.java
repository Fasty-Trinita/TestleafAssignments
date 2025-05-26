package week3.day1w3;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("Software Tester");
		super.performCommonTasks("IT Desk");
	}
	
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.enterText();
		lp.performCommonTasks();
	}
	
}