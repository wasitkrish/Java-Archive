public class InsertMiddle{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
static void insertMid(Node head){
        Node temp=head;
        while(temp.next!=null){
            if(temp.name.equalsIgnoreCase("Arun")){
                Node newIns = new Node("Nithin");
                newIns.next=temp.next;
                temp.next=newIns;
                break;
            }
            else{
                temp=temp.next;
            }
        }
}
static void traverse(Node head){
        while(head!=null){
            System.out.println(head.name);
            head=head.next;
        }
}
    public static void main(String[] middle){
        Node first = new Node("Aditi");
        Node second = new Node("Arun");
        Node third = new Node("Venu");
        first.next=second;
        second.next=third;
        System.out.println("\n List before Insertion : ");
        traverse(first);
        insertMid(first);
        System.out.println("\n List after Insertion : ");
        traverse(first);
    }
}