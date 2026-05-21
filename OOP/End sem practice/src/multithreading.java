class myrunnable implements Runnable{
    String name;
    myrunnable(String name){
        this.name=name;
    }
    public void run(){
         for(int i=0; i<4;i++){
             System.out.println("name: "+name+" i: "+i);
         }
    }
}
public class multithreading{
    public static void main(String[] args){
        Thread t1 = new Thread(new myrunnable("Krish"));
        Thread t2 = new Thread(new myrunnable("Josh"));
        t1.start();
        t2.start();

    }
}