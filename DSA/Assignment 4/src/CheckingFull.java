public class CheckingFull{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void isFull(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        if(count==5){
            System.out.println("Tis group is full. No more students can be added");
        }
        else{
            System.out.println("This group is not at its maximum capacity");
        }
    }
    public static void main(String[] check){
        Node first = new Node("Aditi");
        Node second = new Node("Arjun");
        Node third = new  Node("Venu");
        Node fourth = new Node("Krish");
        Node fifth = new Node("Aadi");

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        isFull(first);
    }
}