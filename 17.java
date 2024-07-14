//17.Count the word

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();  // Read input and trim any leading/trailing whitespace
        
        
        String[] words = input.split("\\s+");
        
        
        int wordCount = words.length;
        
  
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}
