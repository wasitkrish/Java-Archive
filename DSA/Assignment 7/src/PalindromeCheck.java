import java.util.Scanner;
class Stack{
    private int top;
    private int capacity;
    private char[] arr;

    Stack(int size){
        capacity = size;
        arr = new char[capacity];
        top = -1;
    }
    void push(char x){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=x;
    }
    char pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return '\0';
        }
        return arr[top--];
    }
}
public class PalindromeCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to check for palindrome : ");
        String check = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        Stack stack = new Stack(check.length());
        char[] arr = check.toCharArray();
        for(char c : arr){
            stack.push(c);
        }
        boolean palindrome = true;
        for(char c : arr){
            if(c!=stack.pop()){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("The given string is a palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }
        sc.close();
    }
}