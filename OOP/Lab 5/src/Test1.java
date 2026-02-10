// Experiment - 1 : Object creation without Constructor
class Student{
    int id;
    String name;

    void display(){
        System.out.println(id+" "+name);
    }
}

public class Test1{
    public static void main(String[] test1){
        Student s1 = new Student();
        s1.display();
    }
}

/** Logic : so what we see here is that we have a class students which contains instance variables id of int type and name
 of string type, we have a method display() that prints id and name. Then we have a public class Test1, inside of which
 an object s1 of class Student is created. Here An object of the Student class is created using implicit default constructor provided by java compiler.
When the object is created, that line is executed, memory is allocated for the object and the instance variables are  automatically initialized with default values because no constructor is defined in the class.
Output: We get '0 null' as output because we didn't initialize any value to the variables. So the object is created with
default values.
 */