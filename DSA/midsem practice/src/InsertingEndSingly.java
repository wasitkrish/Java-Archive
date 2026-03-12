public class InsertingEndSingly{
    static class Node{
        String name;
        Node next;
        Node(String n){
            this.name=n;
            this.next=null;
        }
    }
    static void endins(Node head, Node add){
        Node temp = head;
        while(head.next!=null){
            head=head.next;
        }
        head.next=add;
        add.next=null;
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
    }
    public static void main(String[] args){
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("venu");
        a.next=b; b.next=c;
        Node add = new Node("Krish");
        endins(a,add);
        traverse(a);
    }
}