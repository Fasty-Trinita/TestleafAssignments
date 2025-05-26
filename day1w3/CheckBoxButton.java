package week3.day1w3;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("Checkbox button clicked");
	}
	
	public static void main(String[] args) {
		CheckBoxButton cbb = new CheckBoxButton();
		cbb.click();
		cbb.clickCheckButton();
		cbb.submit();
	}

}
