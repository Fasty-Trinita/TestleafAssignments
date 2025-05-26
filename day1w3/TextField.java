package week3.day1w3;

public class TextField extends WebElement {
	public void getText(String text) {
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		TextField txt = new TextField();
		txt.setText("Welcome");
		txt.getText("to TestLeaf");
	}

}
