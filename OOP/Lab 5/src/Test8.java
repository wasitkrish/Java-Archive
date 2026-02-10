class Demo{
    Demo(){
        this(10);
        System.out.println("Default constructor");
    }
    Demo(int x){
        System.out.println("Parameterized Constructor: "+x);
    }
}
public class Test8{
    public static void main(String[] test8){
        Demo d = new Demo();
    }
}