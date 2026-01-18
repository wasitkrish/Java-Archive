class LocalVariableDemo{
    void show(){
        int x=10;
        System.out.print("Value of x:"+x);
    }
    public static void main(String[] args){
        LocalVariableDemo obj=new LocalVariableDemo();
        obj.show();
    }
}