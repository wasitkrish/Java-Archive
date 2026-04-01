interface EmployeeB{
    void calculateSalary();
}
class Intern implements EmployeeB{
    double stipend;
    Intern(double stipend){
        this.stipend=stipend;
    }
    public void calculateSalary(){
        System.out.println("Stipend : "+stipend);
    }
}
public class EmployeeSalaryInterface {
    public static void main(String[] args) {
        EmployeeB e = new Intern(55050.5050);
        e.calculateSalary();
    }
}