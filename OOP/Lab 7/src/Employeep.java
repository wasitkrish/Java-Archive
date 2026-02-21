public class Employeep{
    private String name;
    protected double salary;
    Employeep(String n,double s){
        this.name=n;
        this.salary=s;
    }
    void calculateSalary(){
        System.out.println("Employee Salary:"+salary);
    }
    public double bonus(float percent,int hours){
        return(percent/100.0)*salary;
    }
}
class Managerp extends Employeep{
    Managerp(String n, double s){
        super(n,s);
    }
    public double bonus(float percent, int hours){
        return 1.5*super.bonus(percent,hours);
    }
}

class Developerp extends Employeep{
    Developerp(String n,double s){
        super(n,s);
    }
    public double bonus(float percent, int hours){
        double overtimePay=500*hours;
        return super.bonus(percent,hours)+overtimePay;
    }
    public static void main(String[] args){
        Employeep[] emparray= new Employeep[3];
        emparray[0] = new Employeep("Ravi",10000);
        emparray[1] = new Managerp("Anita",150000);
        emparray[2] = new Developerp("Kiran",40000);
        for(int i=0;i<emparray.length;i++){
            emparray[i].calculateSalary();
            System.out.println("Bonus: "+emparray[i].bonus(5.0f,8));
        }
    }
}