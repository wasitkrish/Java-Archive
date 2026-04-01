abstract class Employee{
    double base;
    Employee(double base){
        this.base=base;
    }
    abstract void calculateSalary();
}
class FullTime extends Employee{
    FullTime(double base){
        super(base);
    }
    void calculateSalary(){
        System.out.println("Salary : "+(base+5000));
    }
}
public class EmployeeSalaryAbstract{
    public static void main(String[] args){
        Employee e = new FullTime(35000);
        e.calculateSalary();
    }
}