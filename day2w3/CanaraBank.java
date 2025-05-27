package week3.day2w3;

public abstract class CanaraBank implements Payments{

	
	@Override
	public void cashOnDeliver() {
		// TODO Auto-generated method stub
		System.out.println("Cash on Delivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI payment");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		Payments.super.cardPayments();
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		Payments.super.internetBanking();
	}

	public abstract void recordPaymentDetails();

}
