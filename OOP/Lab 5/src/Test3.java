// Experiment -3 : Parameterized constructor
class Student3{
    int id;
    String name;

    Student3(int i,String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id+" "+name);
    }
}

public class Test3{
    public static void main(String[] args){
        Student3 s1 = new Student3(102,"Ravi");
        Student3 s2 = new Student3(103,"Meera");
        s1.display();
        s2.display();
    }
}

/** LOGIC: similar to the previous programs we have a class Student3 containing instance variables id and name.
 * We have a parameterized constructor Student3(int i, String n) which initializes the instance variables.
 * We have defined a method display() which accesses and displays the initialized values of id and name.
 * We have a public class Test3 with main functions where objects are created and with the creation of objects triggering the constructor the values are accordingly initialized.
 * The values for i and name are passed while creating an object as arguments that are received by the constructor parameters i and n.
 * the values are later displayed by calling the display function which accesses the initialized values.
 */