class Employee{
    double salary;
    void calculateSalary(){
        System.out.println("Salary is: "+salary);
    }
}
class FullTime extends Employee{
    FullTime(double salary){
        this.salary=salary;
    }
}
class Intern extends Employee{
    Intern(double stipend){
        this.salary=stipend;
    }
}
public class SalarySystemNoAbstract {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee[] arr = new Employee[2];
        arr[0]= new FullTime(4356);
        arr[1]= new Intern(500);
        for(int i=0;i<arr.length;i++){
            arr[i].calculateSalary();
        }
        e.calculateSalary();
    }
}