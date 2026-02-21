class Program{
    private String name;
    private double fees;
    Program(String n, double fs){
        this.name=n;
        this.fees=fs;
    }
    public String getname(){
        return name;
    }
    public double getfees(){
        return fees;
    }
    public double calculatefees(){
        return fees;
    }
    public void display(){
        System.out.print("Student: "+name);
        System.out.print("Total Fee: "+calculatefees());
        System.out.print("\n");
    }
}
class Undergraduate extends Program{
    Undergraduate(String n, double fs){
        super(n,fs);
    }
    public double calculatefees(){
        return getfees()+5000;
    }
}
class Postgraduate extends Program{
    Postgraduate(String n, double fs){
        super(n,fs);
    }
    public double calculatefees(){
        return getfees()+10000;
    }
}
class PhD extends Program{
    PhD(String n,double fs){
        super(n,fs);
    }
    public double calculatefees(){
        return getfees()-8000;
    }
}
public class SmartUniversityCourseFeeSystem{
    public static void main(String[] args){
        Program[] p = new Program[3];
        p[0]=new Undergraduate("Arjun",50000);
        p[1]=new Postgraduate("Sneha",60000);
        p[2]=new PhD("Vikram",70000);
        for(int i=0;i<3;i++){
            p[i].display();
        }

    }
}