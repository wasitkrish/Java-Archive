public class deletelastnode{
    static class Node{
        int value;
        Node next;
        Node prev;
        Node(int x){
            this.value=x;
            this.next=null;
            this.prev=null;
        }
    }
    static Node delete(Node head){
        Node temp=head;
        head.prev=head.prev.prev;
        head.prev.next=head;
        return head;
    }
    static void display(Node head){
        Node temp=head;
        do{
            System.out.print(temp.value+" ");
            temp=temp.next;
        }while(temp!=head);
    }
    static void countnode(Node head){
        Node temp = head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        System.out.println("No of elements is : "+count);
    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.prev=n4; n1.next=n2;
        n2.prev=n1; n2.next=n3;
        n3.prev=n2; n3.next=n4;
        n4.prev=n3; n4.next=n1;
        countnode(n1);
        Node edited = delete(n1);
        display(edited);
    }
}