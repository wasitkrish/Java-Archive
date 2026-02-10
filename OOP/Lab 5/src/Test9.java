class Secure{
    private Secure(){
        System.out.println("Private Constructor");
    }
    static Secure createObject(){
        return new Secure();
    }
}
public class Test9{
    public static void main(String[] test9){
        Secure s = Secure.createObject();
    }
}

/** This program demonstrates the use of a private constructor in Java to restrict direct object creation.
 The class Secure defines a private constructor, which prevents objects from being created using the new keyword from outside the class.
 Instead, a public static method createObject() is provided, which internally calls the private constructor and returns a new object of the class.
 In the main method, the object is created by invoking this static factory method rather than calling the constructor directly.
 This approach ensures controlled object creation, improves security, and is commonly used in patterns such as factory methods and singleton design. **/