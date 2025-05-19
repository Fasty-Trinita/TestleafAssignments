package week2.day1;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 ="stops"; 
		String text2 = "potss";
		
		if (text1.length() != text2.length()) {
            System.out.println("The words are not anagrams.");
            return;
        }
        for (int i = 0; i < text1.length(); i++) {
            // If the character in text1 is not found in text2, it's not an anagram
            if (text2.indexOf(text1.charAt(i)) == -1) {
                System.out.println("The words are not anagrams.");
                return;
            }
        }
        System.out.println("The words are anagrams.");
	}
}
