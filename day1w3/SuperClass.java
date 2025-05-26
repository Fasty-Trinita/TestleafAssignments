package week3.day1w3;

public class SuperClass {
	public void takeSnap() {
		System.out.println("takeSnap");
	}
	
	public void reportStep() {
		System.out.println("reportStep");
	}
	
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		sc.takeSnap();
		sc.reportStep();
	}

}
