class MyRunnable2 implements Runnable{
    String name;

    MyRunnable2(String n){
        name =n;
    }
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println(name+": "+ i);
        }
    }
}
public class MultipleThreads{
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable2("T1"));
        Thread t2 = new Thread(new MyRunnable2("T2"));
        Thread t3 = new Thread(new MyRunnable2("T3"));
        t1.start();
        t2.start();
        t3.start();
    }
}