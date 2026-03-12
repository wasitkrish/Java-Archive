public class ReverseDoubly{
    static class Node{
        int num;
        Node prev;
        Node next;
        Node(int x){
            this.num=x;
            this.prev=null;
            this.next=null;
        }
    }
    static Node reverse(Node head){
        Node trav = head;
        Node add = null;
        while(head!=null){
            Node temp = head.prev;
            head.prev=head.next;
            head.next=temp;
            add = head;
            head=head.prev;
        }
        return add;
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.print(head.num+" ");
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