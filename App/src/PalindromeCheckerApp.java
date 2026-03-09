import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String input = scanner.nextLine();
        scanner.close();
        boolean result = check(input, 0, input.length() - 1);

        if(result){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    private static boolean check(String s ,int start,int end){
        if(start >= end){
            return true;
        }


        if(s.charAt(start) != s.charAt(end)){
            return false;
        }


        return check(s, start + 1, end - 1);
    }
}