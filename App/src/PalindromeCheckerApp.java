import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String inputString = scanner.nextLine();
        scanner.close();

        long startTime = System.nanoTime();
        boolean result = isPalindrome(inputString);
        long endTime = System.nanoTime();

        System.out.println("Input: " + inputString);
        System.out.println("Is it palindrome?: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " ns");

    }
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

