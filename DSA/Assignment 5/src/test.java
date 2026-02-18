import java.util.Scanner;

public class test {

    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int x) {
            this.value = x;
            this.prev = null;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in Linked List: ");
        int n = sc.nextInt();

        Node[] s = new Node[n];   // ✅ Declare array

        // Create nodes
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of Node " + (i + 1) + ": ");
            s[i] = new Node(sc.nextInt());
        }

        // Link nodes
        for (int i = 0; i < n; i++) {

            if (i > 0) {
                s[i].prev = s[i - 1];
            }

            if (i < n - 1) {
                s[i].next = s[i + 1];
            }
        }

        // Traverse from head
        traverse(s[0]);
    }
}


/**
 * Node head = null;
 * Node prev = null;
 *
 * for (int i = 0; i < n; i++) {
 *     System.out.print("Enter value of Node " + (i + 1) + ": ");
 *     Node newNode = new Node(sc.nextInt());
 *
 *     if (head == null) {
 *         head = newNode;
 *     } else {
 *         prev.next = newNode;
 *         newNode.prev = prev;
 *     }
 *
 *     prev = newNode;
 * }
 *
 * traverse(head);
 *
 *
 */