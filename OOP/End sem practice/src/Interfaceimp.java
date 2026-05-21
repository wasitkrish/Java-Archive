abstract class Plane{
    private int id;
    public String name;
    private int distance;
    public Plane(int id, String name, int distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }
    abstract public char RateService();
    abstract public void show();
    public int getId() {
        return id;
    }
    public int getDistance() {
        return distance;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("distance: "+distance);
        System.out.println("Service rating: "+RateService());
        show();
        System.out.println("------------------------");
        System.out.println();
    }
}
interface flightdata{
    public double flighthours();
    public boolean inservice();
}
class AirForce1 extends Plane implements flightdata{
    AirForce1(int id, String name, int distance) {
        super(id, name, distance);
    }
    public char RateService(){
        if(getDistance()>500){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public double flighthours(){
        return((double)(getDistance()*24)/100);
    }
    public boolean inservice(){
        if(getId()==1){
            return true;
        }
        else{
            return false;
        }
    }
    public void show(){
        System.out.println("Flight hours: "+flighthours());
        System.out.println("In Service: "+inservice());
    }
}
class f35 extends Plane implements flightdata{
    f35(int id, String name, int distance) {
        super(id, name, distance);
    }
    public char RateService(){
        if(getDistance()>5000){
            return 'A';
        }
        else {
            return 'B';
        }
    }
    public double flighthours(){
        return((double)(getDistance()*24)/100);
    }
    public boolean inservice(){
        if(getId()==202){
            return true;
        }
        else{
            return false;
        }
    }
    public void show(){
        System.out.println("Flight hours: "+flighthours());
        System.out.println("In Service: "+inservice());
    }
}
public class Interfaceimp{
    public static void main(String[] args) {
        Plane p = new AirForce1(1,"AirForce 1",501);
        Plane b = new f35(203,"F-35",6000);
        p.display();
        b.display();

    }
}