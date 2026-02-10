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