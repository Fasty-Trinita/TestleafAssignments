package week3.day2w3;

public interface Payments {
	
	//umimplemented methods
	public void cashOnDeliver();
	public void upiPayments();
	
	//implemented methods
	default void cardPayments() {
		System.out.println("Make a card payment");
	}
	// can give static too instead of default
	default void internetBanking() {
		System.out.println("Make a payment through internet banking");
	}

}
