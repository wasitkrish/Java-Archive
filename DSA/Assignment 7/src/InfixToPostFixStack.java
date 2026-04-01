import java.util.Scanner;

class Node2 {
    Node2 next;
    char data;

    Node2(char data) {
        this.data = data;
        this.next = null;
    }
}

class Stack2 {
    private Node2 top;

    Stack2() {
        top = null;
    }

    void push(char data) {
        Node2 newnode = new Node2(data);
        newnode.next = top;
        top = newnode;
    }

    char pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        char value = top.data;
        top = top.next;
        return value;
    }

    char peek() {
        if (top == null) return '\0';
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class InfixToPostFixStack {

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Expression: ");
        String infix = sc.nextLine().replaceAll("\\s+", "");

        StringBuilder postfix = new StringBuilder(); // 🔥 upgrade here
        Stack2 stack = new Stack2();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch).append(" ");
            }

            // Opening bracket
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop();
            }

            // Operator
            else {
                while (!stack.isEmpty() &&
                        (precedence(stack.peek()) > precedence(ch) ||
                                (precedence(stack.peek()) == precedence(ch) && !isRightAssociative(ch)))) {

                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        System.out.println("Postfix Expression is: " + postfix.toString());
    }
}