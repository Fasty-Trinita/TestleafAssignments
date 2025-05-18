package week1.day2hw;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		int fNum = 0;
		int sNum = 1;
		
		for (int i = 0; i<=num; i++) {
			System.out.println(fNum + " ");
			int finalNum = fNum + sNum;
			fNum = sNum;
			sNum = finalNum;
		}

	}

}
