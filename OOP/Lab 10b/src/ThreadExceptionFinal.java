public class ThreadExceptionFinal{
    public static void main(String[] args){
        Thread t1 = new Thread(new Task(10,2),"T1");
        Thread t2 = new Thread(new Task(10,0),"T2");
        Thread t3 = new Thread(new Task(20,5),"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}