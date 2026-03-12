import java.util.Scanner;
public class Delallocc{
    static class Node{
        int num;
        Node next;
        Node prev;
        Node(int x){
            this.num=x;
            this.next=null;
            this.prev=null;
        }
    }
    static Node dellst(Node head, int y){
        Node temp = head;
        Node trav = null;
        while(temp!=null){
            if(temp.num==y){
                if(temp.prev==null){
                    temp = temp.next;
                    temp.prev=null;
                    trav=temp;
                    temp=temp.next;
                }
                else if(temp.next==null){
                    temp.prev.next=null;
                    trav=head;
                    temp=temp.next;
                }
                else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    trav=head;
                    temp=temp.next;
                }
            }
            else {
                temp = temp.next;
            }
        }
        return trav;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.num+" ");
            head=head.next;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node v1 = new Node(4);
        Node v2 = new Node(7);
        Node v3 = new Node(4);
        Node v4 = new Node(9);
        Node v5 = new Node(11);
        v1.next=v2;
        v2.prev=v1; v2.next=v3;
        v3.prev=v2; v3.next=v4;
        v4.prev=v3; v4.next=v5;
        v5.prev=v4;
        System.out.print("Key to delete: ");
        int key = sc.nextInt();
        Node head = dellst(v1,key);
        display(head);
    }
}