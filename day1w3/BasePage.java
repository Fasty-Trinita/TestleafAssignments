package week3.day1w3;

public class BasePage {
	
	public void findElement() {
		System.out.println("Element found");
	}
	
	public void clickElement() {
		System.out.println("clicked particular element");
	}
	
	public void enterText() {
		System.out.println("entered text");
	}
	
	public void performCommonTasks(String work) {
		System.out.println(work);
	}
	
	public static void main(String[] args) {
		BasePage bp = new BasePage();
		bp.performCommonTasks("IT Desk");
	}

}
