class InstanceVariableDemo{
    int count=0; // instance variable
    void increment(){
        count++;
        System.out.println("Count:"+count);
    }
    public static void main(String[] args){
        InstanceVariableDemo obj1=new InstanceVariableDemo();
        InstanceVariableDemo obj2=new InstanceVariableDemo();
        obj1.increment();
        obj1.increment();
        obj2.increment();
    }
}