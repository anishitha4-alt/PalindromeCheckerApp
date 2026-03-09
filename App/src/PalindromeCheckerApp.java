import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        scanner.close();
        LinkedList<Character> deque = new LinkedList<>();
        for(char c : input.toCharArray()){
            deque.add(c);
        }
        boolean isPalindrome = true;
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }





    }
}