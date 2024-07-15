import java.util.Scanner;

public class FirstLetterPrinter {
    public static void printFirstLetters(String str)
    {
        if (str != null && !str.isEmpty()) 
        {  
            String[] words = str.split("\\s+"); 
            for (String word : words) {
                if (!word.isEmpty()) {
                    System.out.print(word.charAt(0) + " ");
                }
            }
            System.out.println();   
        } else {
            System.out.println("The string is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();
        printFirstLetters(inputString);
        scanner.close();
    }
}
