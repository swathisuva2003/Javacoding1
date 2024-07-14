//1.1.Develop a code to print the following pattern

public class AlphabetPattern {
    public static void main(String[] args) {
        // Loop for rows (from A to E)
        for (char ch = 'A'; ch <= 'E'; ch++) {
            // Loop for printing each character multiple times
            for (int j = 0; j < (ch - 'A' + 1); j++) {
                System.out.print(ch);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
