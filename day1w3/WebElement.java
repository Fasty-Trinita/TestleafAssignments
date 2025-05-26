package week3.day1w3;

public class WebElement {
	
	public void click() {
		System.out.println("Performed Click Action");
	}
	
	public void setText(String text) {
		System.out.println("The given text is :"+text);
		
	}
	
	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		we.setText("Successful");
		
	}

}
