package week3.day1w3;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Incognito gets openened");
	}
	
	public void clearCache() {
		System.out.println("Cache gets cleared");
	}
	
	public static void main(String[] args) {
		Chrome crm = new Chrome();
		crm.openURL();
		crm.navigateBack();
		crm.openIncognito();
		crm.clearCache();
		System.out.println(crm.browserVersion);
	}

}
