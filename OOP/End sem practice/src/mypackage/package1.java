package mypackage;
public class package1{
    static boolean ops=false;
    public int add(int a, int b){
        ops = true;
        return a+b;
    }
    public int sub(int a, int b){
        ops = true;
        return a-b;
    }
    public boolean getOps(){
        return ops;
    }
}
