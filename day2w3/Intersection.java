package week3.day2w3;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1 =  {3, 2, 11, 4, 6, 7};
		int [] num2 = {1, 2, 8, 4, 9, 7};
		
		
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i] == num2[j]) {
					System.out.println("Print the common numbers: "+num1[i]);
				}
			}
		}
	}

}
