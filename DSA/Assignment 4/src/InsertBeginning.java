public class InsertBeginning{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void insertStart(Node head){
        Node temp=head;
        Node newFirst = new Node("Epstein");
        newFirst.next=temp;
        head.next=newFirst;
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
    public static void main(String[] arrange){
        Node first = new Node("Aditi");
        Node second = new Node("Arun");
        Node third = new Node("Venu");
        Node fourth = new Node("Krish");
        Node fifth = new Node("Aadi");

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        insertStart(first);
        traverse(head);
    }
}