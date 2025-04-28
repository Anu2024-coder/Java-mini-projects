import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String originalString = input;
        
        // Remove spaces and make it case-insensitive
        input = input.replaceAll("\\s+", "").toLowerCase();

        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        if (input.equals(reversedString)) {
            System.out.println("\"" + originalString + "\" is a Palindrome string.");
        } else {
            System.out.println("\"" + originalString + "\" is not a Palindrome string.");
        }

        scanner.close();
    }
}
