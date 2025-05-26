package week3.day1w3;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Bitton Submitted");
	}
	
	public static void main(String[] args) {
		Button btn = new Button();
		btn.click();
		btn.setText("Logged in");
		btn.submit();
	}

}
