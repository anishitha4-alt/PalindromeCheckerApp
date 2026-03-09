  UC8
import java.util.LinkedList;
 
  UC7
import java.util.ArrayDeque;
import java.util.Deque;
 
import java.util.LinkedList;
import java.util.Queue;
  main
  main
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
 UC9

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

  UC8

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
 
  UC7

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String input = scanner.nextLine();
        scanner.close();

        Deque<Character> deque=new ArrayDeque<>();
        for(char c:input.toCharArray()){
            deque.addLast(c);
        }
        boolean isPalindrome=true;
        while(deque.size()>1){
            if(deque.removeFirst() != deque.removeLast()){
 
  UC6
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
        System.out.println("Input:");
        String inputString = scanner.nextLine();
        scanner.close();
        Queue<Character> queue=new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        for(char c: inputString.toCharArray()){
            queue.add(c);
            stack.push(c);
 main
        }
        boolean isPalindrome=true;
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
 

 UC9

        if(s.charAt(start) != s.charAt(end)){
            return false;
        }


        return check(s, start + 1, end - 1);

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input:");
        String input=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char c:input.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome=true;
        for(char c:input.toCharArray()){
            if(c != stack.pop()) {
  main
  main
 main
                isPalindrome = false;
                break;
            }
        }
  UC8
        if(isPalindrome){
 
  UC7
        if(isPalindrome){
 
  UC6
        if(isPalindrome){
 
        if(isPalindrome) {
  main
  main
  main
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

  UC8




 
  UC7




 main
    }
}









 
  UC6
 
        sc.close();


  main


  main
    }
}

















  main
