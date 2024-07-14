11.Maxoccurence character

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
                String input = "Hello World";

        
        findMaxOccurrenceCharacter(input);
    }

    public static void findMaxOccurrenceCharacter(String str) {
                str = str.toLowerCase();

                int[] charCount = new int[26];

               for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }

        
        int maxCount = 0;
        char maxChar = ' ';
        
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) ('a' + i);
            }
        }

       
        System.out.println("Maximum occurrence character: " + maxChar);
        System.out.println("Occurrences: " + maxCount);
    }
}
