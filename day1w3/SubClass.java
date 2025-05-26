package week3.day1w3;

public class SubClass extends SuperClass {
	public void takeSnap() {
		System.out.println("TestSnap");
		super.takeSnap();
	}
	
	public static void main(String[] args) {
		SubClass subc = new SubClass();
		subc.takeSnap();
	}

}
