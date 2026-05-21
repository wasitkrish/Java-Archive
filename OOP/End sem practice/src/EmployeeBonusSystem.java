class Employee{
    private int id;
    private String name;
    private int salary;
    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public int calculateBonus(){
        return salary;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Bonus + Salary: "+calculateBonus());
        System.out.println("-----------------------------------");
    }
}
class Manager extends Employee{
    private String department;
    Manager(int id, String name, String department, int salary){
        super(id,name,salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public int calculateBonus(){
        return getSalary()+10000;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Department: "+getDepartment());
        System.out.println("Bonus + Salary: "+calculateBonus());
        System.out.println("-----------------------------------");
    }
}
class Intern extends Employee{
    Intern(int id, String name, int salary){
        super(id,name,salary);
    }
    public int calculateBonus(){
        return getSalary();
    }
}

class Programmer extends Employee{
    private String stack;
    Programmer(int id, String name, int salary, String stack){
        super(id,name,salary);
        this.stack = stack;
    }
    public String getStack(){
        return stack;
    }
    public int calculateBonus(){
        return getSalary()+5000;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Stack: "+getStack());
        System.out.println("Bonus + Salary: "+calculateBonus());
        System.out.println("-----------------------------------");
    }
}
public class EmployeeBonusSystem {
    public static void main(String[] args){
        Employee e1 = new Manager(101,"Krish","IT",10000);
        Employee e2 = new Intern(102,"Shanks",1000);
        Employee e3 = new Programmer(103,"Luffy",5000,"MERN");
        e1.display();
        e2.display();
        e3.display();
    }
}