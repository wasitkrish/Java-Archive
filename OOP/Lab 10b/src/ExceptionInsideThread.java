class Task implements Runnable{
    int num,denom;
    Task(int n, int d){
        num = n;
        denom =d;
    }
    int divide() throws ArithmeticException{
        if(denom==0){
            throw new ArithmeticException("Invalid input");
        }
        return num/denom;
    }
    public void run(){
        try{
            int result = divide();
            System.out.println(Thread.currentThread().getName()+": "+result);
        } catch(ArithmeticException e){
            System.out.println(Thread.currentThread().getName()+": "+e.getMessage());
        }
    }

}