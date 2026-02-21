import java.util.Scanner;
public class InsertDoubly {
    static class Node{
        int value;
        Node prev;
        Node next;
        Node(int x){
            this.value = x;
            this.prev=null;
            this.next=null;
        }
    }
    static void insertDoubly(Node head,int k, Node newnode){
        Node temp=null;
        Node traverse=head;
        int count=0;
        while(traverse!=null){
            traverse=traverse.next;
            count++;
        }
        if(k>count){
            System.out.println("Position exceeds Node count in Linked List");
            System.exit(1);
        }
        else {
            for (int i = 1; i < k; i++) {
                temp = head;
                head = head.next;
            }
            if (head.next == null) {
                newnode.prev = head;
                head.next = newnode;
                newnode.next = null;
            } else if (head.prev == null) {
                newnode.next = head;
                head.prev = newnode;
                newnode.prev = null;
            } else {
                newnode.next = head;
                newnode.prev = temp;
                temp.next = newnode;
                head.prev = newnode;
            }
        }
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Node v1 = new Node(10);
            Node v2 = new Node(20);
            Node v3 = new Node(30);
            Node v4 = new Node(40);
            v1.next=v2;
            v2.prev=v1; v2.next=v3;
            v3.prev=v2; v3.next=v4;
            v4.prev=v3;
        Node newnode = new Node(25);
            System.out.print("Enter position to enter :");
            int k = sc.nextInt();
            insertDoubly(v1,k,newnode);
            if(k==1)
                traverse(newnode);
            else
                traverse(v1);


    }
}