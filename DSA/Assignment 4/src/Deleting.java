public class Deleting{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void deleteNode(Node head){
        Node temp = head;
        while(head!=null){
            if ((head.name.equalsIgnoreCase("Aditi")) || (head.name.equalsIgnoreCase("Arun"))) {
                temp.next=head.next;
                head=head.next;
            }
            else{
                temp=head;
                head = head.next;
            }
        }
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
    }
    public static void main(String[] del){
        Node first = new Node("Rohit");
        Node second= new Node("Aditi");
        Node third= new Node("Arun");
        Node fourth = new Node("Nithin");
        Node fifth = new Node("Venu");
        Node sixth = new Node("Yami");
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        System.out.println("\n List before deleting : ");
        traverse(first);
        System.out.println(("\n List after deleting :"));
        deleteNode(first);
        traverse(first);

    }
}