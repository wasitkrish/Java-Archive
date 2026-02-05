public class InsertEnd{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void insertEnd(Node head){
        Node newnode = new Node("Yami");
        while(head.next!=null){
            head=head.next;
        }
        head.next=newnode;
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
    }
    public static void main(String[] end){
        Node first = new Node("Aditi");
        Node second = new Node("Arun");
        Node third = new Node("Venu");
        first.next=second;
        second.next=third;
        System.out.println("\n List before Insertion is :");
        traverse(first);
        insertEnd(first);
        System.out.println("\n List after Insertion is :");
        traverse(first);

    }
}