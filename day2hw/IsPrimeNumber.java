package week1.day2hw;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 3;
			int count = 0;
			for (int i=2;i<=num;i++)
			{
				if (num%i==0) {
					count ++;
					
				}
			}
			if (count == 2) {
				System.out.println("The Number is not prime number");
			}
		else {
			System.out.println("The Number is prime number");
		}

	}
	}

