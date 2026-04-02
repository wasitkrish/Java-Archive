import java.util.Scanner;
class Queue{
    private int front;
    private int rear;
    private int size;
    private int[] arr;
    Queue(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.arr= new int[size];
    }
    void Enqueue(int x){
        if(rear==size-1){
            System.out.println("Queue Overflow");
            return;
        }
        else if(front==-1){
            ++front;
            arr[++rear]=x;
        }
        else {
            arr[++rear]=x;
        }
    }
    int Dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue Underflow");
            return -1;
        }
        int value = arr[front];
        front++;
        return value;
    }
    void Display(){
        if(front == -1 || front > rear){
            System.out.println("Empty Queue");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class QueueImplementationUsingArray {
    public static void main(String[] args){
        Queue queue = new Queue(3);
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        System.out.println("Dequed: "+queue.Dequeue());
        System.out.println("--- Sample Output ---");
        queue.Display();

    }
}