abstract class Vehiclee{
    double distance;
    Vehiclee(double distance){
        this.distance = distance;
    }
    abstract void fare();
}

class Carr extends Vehiclee{
    Carr(double d){
        super(d);
    }
    void fare(){
        System.out.println("Car Fare: "+distance*15);
    }
}
class Bike extends Vehiclee{
    Bike(double d){
        super(d);
    }
    void fare(){
        System.out.println("Bike Fare: "+distance*8);
    }
}

public class VehicleFareWithAbstract {
    public static void main(String[] args){
        // Vehiclee v = new Vehiclee(); -> abstract class objects cant be created
        Vehiclee[] arr = new Vehiclee[2];
        arr[0] = new Carr(100);
        arr[1] = new Bike(500);
        for(int i = 0; i < arr.length; i++){
            arr[i].fare();
        }
    }
}