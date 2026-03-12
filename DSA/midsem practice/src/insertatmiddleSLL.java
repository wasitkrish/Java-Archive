public class insertatmiddleSLL{
    static class Node{
        String name;
        Node next;
        Node(String n){
            this.name=n;
            this.next=null;
        }
    }
    static void insertele(Node head, Node neww){
        Node temp=head;
        if(head==null){
            return;
        }
        else{
            while(head!=null){
                if((head.name).equalsIgnoreCase("Arun")){
                    neww.next=head.next;
                    head.next=neww;
                    return;
                }
                else {
                    head=head.next;
                }
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
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("venu");
        a.next=b; b.next=c;
        Node aan = new Node("Krish");
        insertele(a,aan);
        traverse(a);
    }
}