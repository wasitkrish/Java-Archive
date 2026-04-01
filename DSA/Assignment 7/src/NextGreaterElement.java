import java.util.Scanner;
class Stack4{
    private int size;
    private int[] arr;
    private int top;
    Stack4(int size){
        this.size=size;
        this.top=-1;
        this.arr=new int[size];
    }
    void push(int x){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=x;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int value=arr[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
}
public class NextGreaterElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Stack4 stack = new Stack4(n);
        System.out.print("enter elements in stack: ");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        // Pop into array (reverse order)
        int[] arr= new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        // NGE logic using a NEW stack
        Stack4 newstack = new Stack4(n);
        int[] result = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!newstack.isEmpty() && newstack.peek()<=arr[i]){
                newstack.pop();
            }
            if(newstack.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=newstack.peek();
            }
            newstack.push(arr[i]);
        }
        // Print result
        System.out.print("Next greater Elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}