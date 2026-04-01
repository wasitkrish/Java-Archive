import java.util.Scanner;
class Node{
    Node next;
    char letter;
    Node(char letter){
        this.letter=letter;
        this.next=null;
    }
}
class Stackk{
    private Node top;
    public Stackk(){
        top = null;
    }
    public void push(char letter){
        Node newNode = new Node(letter);
        newNode.next=top;
        top=newNode;
    }
    public char pop(){
        if(top==null){
            System.out.println("Stack Underflow");
        }
        char value = top.letter;
        top = top.next;
        return value;
    }
}
public class PalindromeCheckLList  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String enter = sc.nextLine();
        enter = enter.toLowerCase().replaceAll("\\s+","");
        Stackk stack = new Stackk();
        boolean isPalindrome = true;

        for(int i =0 ; i<enter.length();i++){
            stack.push(enter.charAt(i));
        }

        for(int i=0; i<enter.length();i++){
            if(enter.charAt(i)!=stack.pop()){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given String is not Palindrome");
        }
    }
}