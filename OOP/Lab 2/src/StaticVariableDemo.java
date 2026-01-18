class StaticVariableDemo{
    static int count=0; // static variable
    void increment(){
        count++;
        System.out.println("Count : "+count);
    }
    public static void main(String[] args){
        StaticVariableDemo obj1= new StaticVariableDemo();
        StaticVariableDemo obj2= new StaticVariableDemo();
        obj1.increment();
        obj1.increment();
        obj2.increment();
    }
}