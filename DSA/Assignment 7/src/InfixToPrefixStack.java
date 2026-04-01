import java.util.Scanner;
class Node3{
    Node3 next;
    char data;
    Node3(char data){
        this.data=data;
        this.next=null;
    }
}
class Stack3{
    private Node3 top;
    Stack3(){
        top = null;
    }
    void push(char data){
        Node3 newNode = new Node3(data);
        newNode.next=top;
        top=newNode;
    }
    char pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return '\0';
        }
        char value = top.data;
        top=top.next;
        return value;
    }
    char peek(){
        if(top==null) return '\0';
        return top.data;
    }
    boolean isEmpty() {
        return top == null;
    }
}
public class InfixToPrefixStack {
    static int precedence(char c){
        switch(c){
            case '+':
                case '-': return 1;
                case '*':
                    case '/': return 2;
                    case '^': return 3;
        }
        return -1;
    }
    static boolean isRightAssociative(char c){
        return c == '^';
    }
    static String reverse(String s){
        StringBuilder temp = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch=='(') temp.append(')');
            else if(ch==')') temp.append('(');
            else temp.append(ch);
        }
        return temp.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Infix Expression : ");
        String s = sc.nextLine().replaceAll("\\s+","");
        String infix = reverse(s);
        StringBuilder postfix = new StringBuilder();
        Stack3 stack = new Stack3();
        for(int i=0; i<infix.length();i++){
            char ch = infix.charAt(i);

            //operand
            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch).append(" ");
            }
            //opening brackets
            else if(ch=='('){
                stack.push(ch);
            }
            //closing brackets
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop();
            }
            // operator
            else{
                while (!stack.isEmpty() &&
                        (precedence(stack.peek()) > precedence(ch) ||
                                (precedence(stack.peek()) == precedence(ch) && !isRightAssociative(ch)))) {

                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }
        //pop remaining values
        while(!stack.isEmpty()){
            postfix.append(stack.pop()).append(" ");
        }
        String[] tokens = postfix.toString().trim().split("\\s+");
        StringBuilder prefix = new StringBuilder();
        for(int i=tokens.length-1; i>=0;i--){
            prefix.append(tokens[i]);
            if(i!=0) prefix.append(" ");
        }
        System.out.println("Prefix Expression is: "+prefix.toString());
    }
}
