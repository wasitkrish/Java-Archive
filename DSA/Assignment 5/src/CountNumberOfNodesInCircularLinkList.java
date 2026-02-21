public class CountNumberOfNodesInCircularLinkList{
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
    static void count(Node head){
        if(head == null){
            System.out.println("Total Nodes: 0");
            return;
        }
        int count=0;
        Node temp=head;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        System.out.println("Total Nodes: "+count);
    }
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.prev=n5; n1.next=n2;
        n2.prev=n1; n2.next=n3;
        n3.prev=n2; n3.next=n4;
        n4.prev=n3; n4.next=n5;
        n5.prev=n4; n5.next=n1;
        count(n1);
    }
}