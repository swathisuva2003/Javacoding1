//9.Determine Character:

import java.util.HashSet;

public class CompleteString {
    public static void main(String[] args) {
        
        String input = "abcdefghijklmnopqrstuvwxyz";

        if (isCompleteString(input)) {
            System.out.println("Yes, it's a complete string");
        } else {
            System.out.println("No, it's not a complete string");
        }
    }

    public static boolean isCompleteString(String str) {
               str = str.toLowerCase();


        HashSet<Character> uniqueChars = new HashSet<>();

                for (char ch : str.toCharArray()) {
                       if (ch >= 'a' && ch <= 'z') {
                uniqueChars.add(ch);
            }
        }

                return uniqueChars.size() == 26;
    }
}
