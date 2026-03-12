public class InsertBeginningSLL{
    static class Node{
        String name;
        Node next;
        Node(String n){
            this.name=n;
            this.next=null;
        }
    }
    static Node InsertStart(Node head,Node add){
        Node temp = head;
        add.next=head;
        head=add;
        return head;
    }
    static void traverse(Node newhead){
        if(newhead==null){
            return;
        }
        else{
            while(newhead!=null){
                System.out.println(newhead.name);
                newhead=newhead.next;
            }
        }
    }
    public static void main(String[] args){
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("Venu");
        a.next=b; b.next=c;
        Node newl = new Node("Krish");
        traverse(InsertStart(a,newl));
    }
}