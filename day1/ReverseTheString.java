package week2.day1;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "Abiee Fasty Trinita";
		
		char[] val = value.toCharArray();
		
		for (int i = val.length-1; i >=0 ; i--) {
			System.out.print(val[i]);	
			//System.out.println(val[i]);
		}
	}
}
