package week3.day1w3;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Snap captured");
	}
	
	public void clearCookies() {
		System.out.println("Cookies gets cleared");
	}
	
	public static void main(String[] args) {
		Edge edg = new Edge();
		edg.takeSnap();
		edg.clearCookies();
		System.out.println(edg.browserName);
		edg.closeBrowser();
	}

}
