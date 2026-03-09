import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String inputString = scanner.nextLine();
        scanner.close();

        String normalized = inputString.replaceAll("\\s+","").toLowerCase();

        boolean isPalindrome = true;

        for(int i = 0; i < normalized.length()/2; i++){
            if(normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");



    }
}