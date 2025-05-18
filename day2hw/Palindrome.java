package week1.day2hw;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3223;
		int orgNum = num;
		int rev = 0;
		String temp = "" ;
		
		for (; num>0 ; num/=10) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
		}
		if (orgNum == rev) {
			System.out.println("The given value is Plaindrome"); 
	}
		else {
			System.out.println("The given value is not a Palindrome");
		}
	}
}

