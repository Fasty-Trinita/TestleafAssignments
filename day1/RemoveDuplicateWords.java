package week2.day1;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        
        String text = "We learn Java basics as part of java sessions in java week1";
        
        
        String[] split = text.split(" ");
        
        
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                // If a duplicate is found, replace it with an empty string
                if (split[i].equalsIgnoreCase(split[j])) {
                    split[j] = ""; // Mark as empty
                }
            }
        }

        String result = "";
        for (String word : split) {
            if (!word.equals("")) {
                result += word + " ";
            }
        }
        
        System.out.println(result.trim());
    }
}
