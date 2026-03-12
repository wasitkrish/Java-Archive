import java.util.Scanner;

public class SearchingSingleLinkedList{
    static class Node{
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void Search(Node head,String name){
        Node temp = head;
        boolean flag=false;
        if(head==null){
            return;
        }
        else{
            while(head!=null){
                if((head.name).equalsIgnoreCase(name)){
                    System.out.println(name+" is Member of the group");
                    return;
                }
                head=head.next;
            }
                System.out.println(name+" is NOT member of the group");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("venu");
        a.next=b;b.next=c;
        System.out.print("Enter name to search: ");
        String name= sc.nextLine();
        Search(a,name);
    }
}