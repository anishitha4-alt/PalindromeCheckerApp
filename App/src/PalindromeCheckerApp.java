import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * Application entry point
     * <p>
     * This is a Java Palindrome Checker App Welcome Message
     *
     * @author Developer
     * @Version 1.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = scanner.nextLine();
        scanner.close();

        String reverseString = "";
        int length = inputString.length();

         for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }

         if (inputString.equals(reverseString)) {
            System.out.println("Input string is a palindrome.");
        } else {
            System.out.println("Input string is not a palindrome.");
        }

    }
}