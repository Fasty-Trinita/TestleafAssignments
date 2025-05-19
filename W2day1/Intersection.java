package week2.day1;

import java.util.Iterator;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,11,4,6,7}; 
		int b[]= {1,2,8,4,9,7};
		
		System.out.println("The intersection of the two arrays is:");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					break;
				}
					
				
			}
		}

	}

}
