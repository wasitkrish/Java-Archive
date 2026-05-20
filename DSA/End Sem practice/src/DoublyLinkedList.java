public class DoublyLinkedList{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    static Node insertat(Node head,int index, int value){
        Node temp = head;
        Node ht;
        Node insnew = new Node(value);
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        if(index==1){
            insnew.next=temp;
            head.prev=insnew;
            insnew.prev=null;
            ht=insnew;
        }
        else{
            insnew.prev=temp.prev;
            insnew.next=temp;
            insnew.prev.next=insnew;
            temp.prev=insnew;
            ht = head;
        }
        return ht;
    }
    static void traverse(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    static Node reverse(Node head){
        Node temp=head;
        Node l =null;
        while(temp!=null){
            Node c = temp.next;
            temp.next=temp.prev;
            temp.prev=c;
            l=temp;
            temp=temp.prev;
        }
        return l;

    }
    static Node deleteoccurance(Node head, int key){
        Node temp = head;
        Node sub = null;
        while(temp!=null){
            if(temp.data==key){
                if(temp.prev==null){
                    temp.next.prev=null;
                    temp=temp.next;
                    head=temp;
                }
                else if(temp.next==null){
                    temp.prev.next=null;
                    temp=temp.prev;
                    head=temp;
                }
                else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    temp=temp.prev;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next=n2;
        n2.next=n3; n2.prev=n1;
        n3.next=n4; n3.prev=n2;
        n4.prev=n3;
        Node neww = insertat(n1,3,25);
        traverse(neww);
        System.out.println("Reverse is:");
        Node l=reverse(neww);
        traverse(l);
        Node test = insertat(n1,1,25);
        traverse(test);
        System.out.println();
        Node check = deleteoccurance(test,25);
        traverse(check);




    }
}