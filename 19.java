//19.Vowel count

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();  
        
      
        String[] words = input.split("\\s+");
        
                for (String word : words) {
            int vowelCount = countVowels(word);
            System.out.println(word + ": " + vowelCount);
        }
        
        scanner.close();
    }
    
    
    private static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : word.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
