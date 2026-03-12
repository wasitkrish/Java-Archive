import java.util.Scanner;
public class insertatposdoubly {
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
    static Node insertDoubly(Node head,int k, Node newnode){

        Node traverse=head;
        int count=0;

        while(traverse!=null){
            traverse=traverse.next;
            count++;
        }
        System.out.println(count);
        if(k > count+1){
            System.out.println("Position exceeds Node count in Linked List");
            return head;
        }

        if(k == 1){
            newnode.next=head;
            if(head!=null)
                head.prev=newnode;
            return newnode;
        }

        Node temp=head;

        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }

        newnode.next=temp.next;
        newnode.prev=temp;

        if(temp.next!=null)
            temp.next.prev=newnode;

        temp.next=newnode;

        return head;
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.print(head.value+" ");
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
        Node ss = insertDoubly(v1,k,newnode);
        traverse(ss);


    }
}