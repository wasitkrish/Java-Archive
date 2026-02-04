public class Traversing{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void traverse(Node head){
        int count=0;
        Node temp=head;
        while(head!=null){
            count++;
            head=head.next;
        }
        System.out.println("Number of students : "+count);
        System.out.println("Students in the group project");
        head=temp;
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
    }
    public static void main(String[] traverse){
        Node first = new Node("Aditi");
        Node second = new Node("Arjun");
        Node third = new Node("venu");
        first.next=second;
        second.next=third;
        traverse(first);
    }
}