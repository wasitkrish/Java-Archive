class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread"+i);
        }
    }
}
public class BasicThreadUsingRunnable{
    public static void main(String[] args){
        Thread t = new Thread(new MyRunnable());
        t.run();
        t.run();
    }
}