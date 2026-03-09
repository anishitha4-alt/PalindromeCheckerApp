import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String inputString = scanner.nextLine();
        scanner.close();

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.checkPalindrome(inputString);

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");


    }
}
interface PalindromeStrategy{
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy{
    public boolean check(String input){
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(char c : input.toCharArray()){
            stack.push(c);
        }

        for(char c : input.toCharArray()){
            if(c != stack.pop()){
                return false;
            }
        }

        return true;
    }
}
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy){
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input){
        return strategy.check(input);
    }
}

