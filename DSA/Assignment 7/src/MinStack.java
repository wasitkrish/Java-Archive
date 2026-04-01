import java.util.Stack;
public class MinStack{
    private Stack<Integer> main;
    private Stack<Integer> minstack; // top always holds current minimum
    public MinStack(){
        this.main=new Stack<>();
        this.minstack= new Stack<>();
    }
    //O(1)
    public void push(int x){
        main.push(x);
        if(minstack.isEmpty() || x<=minstack.peek()){
            minstack.push(x);
        }
        else{
            minstack.push(minstack.peek()); // repeat current min
        }
        System.out.println("push(" + x +")");
    }
    //O(1)
    public int pop(){
        minstack.pop();
        return main.pop();
    }
    //O(1)
    public int top(){
        return main.peek();
    }
    //O(1)
    public int getMin(){
        return minstack.peek();
    }
    public static void main(String[] args){
        MinStack ma = new MinStack();
        System.out.println("\n --- Sample Input 1 ---");
        ma.push(5);
        ma.push(3);
        ma.push(7);
        System.out.println(ma.getMin());
        ma.pop();
        System.out.println(ma.getMin());
        MinStack ms = new MinStack();
        System.out.println("\n --- Sample Input 2 ---");
        ms.push(10);
        ms.push(20);
        ms.push(5);
        System.out.println("getMin() = " + ms.getMin());
        ms.push(15);
        System.out.println("getMin() = " + ms.getMin());
        ms.push(3);
        System.out.println("getMin() = " + ms.getMin());
        ms.pop();
        System.out.println("getMin() = " + ms.getMin());
        ms.pop();
        System.out.println("top() = " + ms.top());
        System.out.println("getMin() = " + ms.getMin());
    }
}