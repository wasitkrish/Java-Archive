public class deletesingly{
    static class Node{
        String name;
        Node next;
        Node(String n){
            this.name=n;
            this.next=null;
        }
    }
    static void delete(Node head){
        Node temp = head;
        while(head!=null){
            if((head.name).equalsIgnoreCase("Aditi") || (head.name).equalsIgnoreCase("Arun")){
                temp.next=head.next;
                head=head.next;
            }
            else{
                temp=head;
                head=head.next;
            }

        }
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
    }
    public static void main(String[] args){
        Node a = new Node("Rohit");
        Node l = new Node("Nitihin");
        Node b = new Node("Aditi");
        Node c = new Node("Arun");
        Node d = new Node("Venu");
        Node e = new Node("Yami");
        a.next=l; l.next=b; b.next=c; c.next=d; d.next=e;
        delete(a);
        traverse(a);
    }
}