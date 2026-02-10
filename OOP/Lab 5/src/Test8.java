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

/** This program demonstrates constructor chaining in Java using the this() keyword.
 The class Demo contains two overloaded constructors, where the default constructor calls the parameterized constructor using this(10) as its first statement.
 When an object is created, the default constructor is invoked first, but due to constructor chaining, the parameterized constructor executes before the remaining statements of the default constructor.
 As a result, the parameterized constructor prints its message first, followed by the default constructor.
 This confirms that constructor chaining allows one constructor to reuse another constructor’s logic, enforces a fixed execution order, and ensures proper object initialization. **/