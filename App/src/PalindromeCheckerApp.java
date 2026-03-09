import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String inputString = scanner.nextLine();
        scanner.close();

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(inputString);

        if(result){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

class PalindromeService{
    public boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length() - 1;

        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}