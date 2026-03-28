class Vehicle{
    double distance;
    void fare(){
        System.out.println("Fare: "+distance*10);
    }
}
class Car extends Vehicle{
    Car(double d){
        this.distance=d;
    }
}
class bike extends Vehicle{
    bike(double d){
        this.distance=d;
    }
    void fare(){
        System.out.println("Bike: "+distance*1);
    }
}

public class VehicleFareNoAbstract {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle[] arr = new Vehicle[2];
        arr[0] = new Car(100);
        arr[1] = new bike(500);
        for(int i=0;i<arr.length;i++){
            arr[i].fare();
        }
        v.fare();
    }
}
