package week2.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] split = test.toCharArray();
		for (int i = 0; i < split.length; i++) {
			 if (i % 2 != 0) {
	                split[i] = Character.toUpperCase(split[i]);
	                
	            }
		}
		String result = new String(split);
		System.out.println(result);

	}

}

