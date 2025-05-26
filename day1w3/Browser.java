package week3.day1w3;

public class Browser {

	String browserName = "browser";
	float browserVersion = 5.1f;
	
	public void openURL() {
		System.out.println("The url gets openened");
	}
	
	public void closeBrowser() {
		System.out.println("Browser cleared");
	}
	
    public void navigateBack() {
    	System.out.println("navigated to the previous page");
	}
}
