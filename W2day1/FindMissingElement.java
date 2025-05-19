package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = {1, 4,3,2,8, 6, 7};
		Arrays.sort(value);
		for (int i = 0; i < value.length; i++) {
			if(value[i] != i + 1) {
				System.out.println("The missing element is: "+(i+1));
				break;
			}
		}
	}
}
