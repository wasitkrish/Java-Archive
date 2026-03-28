abstract class Employeee{
    double base;
    Employeee(double base){
        this.base=base;
    }
    abstract void calculateSalary();
}
class FullTimee extends Employeee{
    FullTimee(double base){
        super(base);
    }
    void calculateSalary(){
        System.out.println("FullTime Salary is: "+(base+5000));
    }
}
class Internn extends Employeee{
    Internn(double base){
        super(base);
    }
    void calculateSalary(){
        System.out.println("Internn Stipend is: "+base);
    }
}
public class SalarySystemWithAbstract {
    public static void main(String[] args) {
        // Employeee e = new Employeee(); -> cant create objects of abstract class
        Employeee[] arr = new Employeee[2];
        arr[0]= new FullTimee(4365);
        arr[1]= new Internn(500);
        for(int i=0;i<arr.length;i++){
            arr[i].calculateSalary();
        }
    }
}