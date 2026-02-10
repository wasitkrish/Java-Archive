class Employee{
    int id;

    Employee(int i){
        id=i;
        System.out.println("Constructor called ! ");
    }
    void setId(int i){
        id=i;
        System.out.println("Method called");
    }
}

public class Test5{
    public static void main(String[] test5){
        Employee e1 = new Employee(10);
        e1.setId(20);
    }
}


/** This program is based on comparision of Constructor vs Methods. In the program a constructor Employee is created which takes i as parameter and assigns to id;
 We also have a method setId that does the same thing as constructor;
 The main difference between these two are the constructor is called on object creation but method needs to be called explicitly to perform operations inside the method.
 Thats what the obove program show us.

 This program demonstrates the difference between a constructor and a method in Java.
 The class Employee contains a parameterized constructor that takes an integer value and initializes the instance variable id. This constructor is automatically invoked when an object of the class is created.
 The class also contains a method setId(), which performs a similar task of assigning a value to id, but it must be called explicitly using the object reference.
 In the main method, when the object e1 is created, the constructor is called automatically and initializes id with the value 10.
 Later, the method setId() is explicitly called to change the value of id to 20.
This program shows that constructors are used for object initialization at the time of creation, whereas methods are used to perform operations after the object has been created.
 */