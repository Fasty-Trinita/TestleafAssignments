package week3.day1w3;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("Snap captured");
	}
	
	public void fullScreenMode() {
		System.out.println("Cookies gets cleared");
	}
	
	public static void main(String[] args) {
		Safari saf = new Safari();
		saf.navigateBack();
		System.out.println(saf.browserName);
		saf.closeBrowser();
}
}
