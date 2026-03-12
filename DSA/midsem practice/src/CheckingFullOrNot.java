import java.util.Scanner;
public class CheckingFullOrNot{
    static class Node{
        String name;
        Node next;
        Node(String n){
            this.name=n;
            this.next=null;
        }
    }
    static void checkfull(Node head, int max){
        Node temp = head;
        int count=0;
        if(head==null){
            return;
        }
        else{
            while(head!=null){
                count++;
                head=head.next;
            }
        }
        if(count==max){
            System.out.println("Group is Full, no more students can be added");
        }
        else if(count<max){
            System.out.println("Group has seats "+(max-count)+" members can be added");
        }
        else {
            System.out.println("Invalid max count, max count exceeds number of members");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node a = new Node("Aditi");
        Node b = new Node("Arun");
        Node c = new Node("Venu");
        a.next=b; b.next=c;
        System.out.print("Enter maximum number of students for the group: ");
        int m = sc.nextInt();
        checkfull(a,m);
    }
}