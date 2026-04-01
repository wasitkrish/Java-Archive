abstract class Vehicle{
    double distance;
    Vehicle(double distance){
        this.distance = distance;
    }
    abstract void fare();
}
class Car extends Vehicle{
    Car(double distance){
        super(distance);
    }
    void fare(){
        System.out.println("Car Fare: "+distance*15);
    }
}
public class VehicleFareAbstract {
    public static void main(String[] args) {
        Vehicle v = new Car(100);
        v.fare();
    }
}