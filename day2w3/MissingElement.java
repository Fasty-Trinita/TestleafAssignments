package week3.day2w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] no =  {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> arr = new ArrayList<Integer>();
		for (Integer i : no) {
				arr.add(i);
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		//using add method
		arr.add(4, 5);
		arr.add(6, 7);
		arr.add(8, 9);
		System.out.println(arr);
		
		//Using for loop
		List<Integer> complete = new ArrayList<Integer>();
		
		int min = arr.get(0);
        int max = arr.get(arr.size() - 1);
	
        for (int i = min; i <= max; i++) {
				complete.add(i);

			}
        System.out.println(complete);

	}

}
