import java.util.Scanner;
public class DeleteAllOccurence{
    static class Node{
        int value;
        Node prev;
        Node next;
        Node(int x){
            this.value=x;
            this.prev=null;
            this.next=null;
        }
    }
    static Node traverse(Node head,int k){
        Node temp=head;
        while(temp!=null){
            if(temp.value==k){
                if(temp.prev==null){
                    temp.next.prev=null;
                    head=temp.next;
                    temp=temp.next;
                }
                else if(temp.next==null){
                    temp.prev.next=null;
                    temp=temp.prev.next;
                }
                else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    temp=temp.next;
                }
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.value+" ");
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
        Node head = traverse(v1,key);
        display(head);
    }
}