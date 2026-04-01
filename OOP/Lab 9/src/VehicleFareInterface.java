interface Vehiclee{
    void fare();
}
class Bike implements Vehiclee{
    double distance;
    Bike(double distance){
        this.distance = distance;
    }
    public void fare(){
        System.out.println("Bike Fare : "+distance*8);
    }
}
public class VehicleFareInterface {
    public static void main(String[] args) {
        Vehiclee v = new Bike(100);
        v.fare();
    }
}