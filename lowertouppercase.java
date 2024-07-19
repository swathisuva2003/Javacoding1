import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String convertedString = convertCase(inputString);
        System.out.println(convertedString);
    }
    public static String convertCase(String str) {
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            } else {
                converted.append(ch); 
            }
        }
        return converted.toString();
    }
}