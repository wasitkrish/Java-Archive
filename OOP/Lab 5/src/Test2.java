// Experiment -2 : Default constructor
class Student2{
    int id;
    String name;

    Student2(){
        id=101;
        name="Asha";
    }

    void display(){
        System.out.println(id+" "+name);
    }
}
public class Test2{
    public static void main(String[] test2){
        Student2 s1 = new Student2();
        s1.display();
    }
}

/** LOGIC: here we have a class Student2 with instance variables id and name of type integer and String respectively.
 * we have a class constructor with same name as the class Student2 which initializes values for id and name as 101 and Aasha respectively.
 * we have a method defined as display() that prints the values stored in  id and name.
 * Then we have class Test2 with the main method inside which an object is created of Student2 class with object refrence s1.
 *
 * Working: When the object is created it triggers default constructor Student2() which initializes the instance variables. As a result the object
 * doesnot retain Javas implicit default values 0 and null. Then when the method display() is called it accesses the initialized instance variable and prints it.
 */