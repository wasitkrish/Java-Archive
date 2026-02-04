import java.util.Scanner;
public class Searching{
    static class Node {
        String name;
        Node next;
        Node(String name){
            this.name=name;
            this.next=null;
        }
    }
    static void search(String key, Node head){
        while(head!=null){
            if(head.name.equalsIgnoreCase(key)){
                System.out.println(key+" is a member of project group.");
                return;
            }
            head=head.next;
        }
        System.out.println(key+" is NOT a member of project group");

    }
    public static void main(String[] searching){
        Scanner sc = new Scanner(System.in);
        Node first = new Node("Aditi");
        Node second = new Node("Arjun");
        Node third = new Node("Venu");
        first.next=second;
        second.next=third;
        System.out.print("Enter the name of a member to search : ");
        String search = sc.nextLine();
        search(search,first);
    }
}