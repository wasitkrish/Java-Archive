import java.util.Scanner;
public class ReverseDoubly{
    static class Node{
        int value;
        Node prev;
        Node next;
        Node(int x){
            this.value=x;
            this.prev=null;
            this.next=null;
        }
    }
    static Node reverse(Node head) {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;  // move using swapped prev
        }
        // After loop, temp will be at node before new head
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
    public static void main(String[] args){
        Node v1 = new Node(5);
        Node v2 = new Node(10);
        Node v3 = new Node(15);
        Node v4 = new Node(20);
        v1.next=v2;
        v2.prev=v1; v2.next=v3;
        v3.prev=v2;v3.next=v4;
        v4.prev=v3;
        Node ne;
        ne=reverse(v1);
        traverse(ne);
    }
}
