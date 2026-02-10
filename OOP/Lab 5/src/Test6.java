class Counter{
    Counter(){
        System.out.println("Object created");
    }
}

public class Test6{
    public static void main(String[] test6){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}


/** This program demonstrates that a constructor is called each time an object of a class is created.
 The class Counter contains a default constructor that prints a message when an object is created.
 In the main method, three objects (c1, c2, and c3) are created, so the constructor is invoked three times.
 This proves that constructors are executed automatically during object creation.
 */