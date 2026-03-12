public class TraversingLinkedList{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void traverse(Node head){
        Node temp=head;
        int count=0;
        if(head.next==null){
            return;
        }
        else{
            while(head!=null){
                System.out.println(head.name);
                count++;
                head=head.next;
            }
        }
        System.out.println("Number of Students: "+count);
    }
    public static void main(String[] args){
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("Venu");
        a.next=b; b.next=c;
        traverse(a);
    }
}