public class InsertBeginning{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static Node insertStart(Node head){
        Node temp=head;
        Node newFirst = new Node("Rohit");
        newFirst.next=temp;
        head=newFirst;
        return(head);
    }
    static void traverse(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.name);
            temp=temp.next;
        }
    }
    public static void main(String[] arrange){
        Node first = new Node("Aditi");
        Node second = new Node("Arun");
        Node third = new Node("Venu");
        first.next=second;
        second.next=third;
        System.out.println("Initial List Before Insertion :");
        traverse(first);
        Node newFirst = insertStart(first);
        System.out.println("\n The updated list is :");
        traverse(newFirst);
    }
}