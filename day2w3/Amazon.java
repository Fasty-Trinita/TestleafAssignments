package week3.day2w3;

public class Amazon extends CanaraBank{


	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record the Payment Details");
		
	}
	
	public static void main(String[] args) {
		Amazon abs = new Amazon();
		abs.upiPayments();
		abs.internetBanking();
		abs.recordPaymentDetails();
	}
	

}
