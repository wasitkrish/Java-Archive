public class traversinglinkedlist{
    static class Node{
        String n;
        Node next;
        Node(String name){
            this.n=name;
            this.next=null;
        }
    }
    static public void traversal(Node head){
        Node temp = head;
        int count=0;
        System.out.println("Traversal: ");
        while(temp!=null){
            System.out.print(temp.n+" ");
            count++;
            temp=temp.next;
        }
        System.out.println("Count is: "+count);
    }
    static boolean check(Node head, String name){
        Node temp = head;
        while(temp!=null){
            if(temp.n.equalsIgnoreCase(name)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    static boolean full(Node head, int max){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        if(count<max){
            return true;
        }
        else{
            return false;
        }
    }
    static Node insertstart(Node head,String name){
        Node n3 = new Node(name);
        n3.next=head;
        head=n3;
        return head;
    }
    static void insertend(Node head, String name){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node n4 = new Node(name);
        temp.next=n4;
    }
    static void insertmiddle(Node head, String name, String after){
        Node temp = head;
        while(temp.next!=null){
            if(temp.n.equalsIgnoreCase(after)){
                Node n5 = new Node(name);
                n5.next=temp.next;
                temp.next=n5;
            }
            temp=temp.next;
        }
    }
    static void delete(Node head, String name){
        Node temp = head;
        while(temp.next!=null){
            head=temp;
            temp=temp.next;
            if(temp.n.equalsIgnoreCase(name)){
                head.next=temp.next;
            }
        }
    }
    public static void main (String[] args){
        Node n1 = new Node("Krish");
        Node n2 = new Node("Salan");
        Node n3 = new Node("Niranjan");
        n1.next=n2; n2.next=n3;
        traversal(n1);
        if(check(n1,"krish")){
            System.out.println("In group");
        }
        else{
            System.out.println("Not in group");
        }
        if(full(n1,3)){
            System.out.println("Not full");
        }
        else{
            System.out.println("Full");
        }
        Node h=insertstart(n1,"Divesh");
        traversal(h);
        insertend(h,"Manik");
        traversal(h);
        insertmiddle(h,"Aezaz","Salan");
        traversal(h);
        delete(h,"Aezaz");
        traversal(h);



    }
}