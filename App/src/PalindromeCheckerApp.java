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

        char[] chars = inputString.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}





