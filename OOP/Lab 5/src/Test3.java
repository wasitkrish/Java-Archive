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