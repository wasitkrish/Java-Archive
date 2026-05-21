abstract class Vehicle{
    private int  distance;
    Vehicle(int d){
        distance=d;
    }
    abstract public int calculateFare();
    public void display(){
        System.out.println("Total fare: "+calculateFare());
    }
    public int getDist(){
        return distance;
    }
}
class Bike extends Vehicle{
    Bike(int d){
        super(d);
    }
    public int calculateFare(){
        return getDist()*100;
    }
}
class Car extends Vehicle{
    Car(int d){
        super(d);
    }
    public int calculateFare(){
        return getDist()*1000;
    }
}
class Truck extends Vehicle{
    Truck(int d){
        super(d);
    }
    public int calculateFare(){
        return getDist()*5000;
    }
}
public class abstractimp{
    public static void main(String[] args) {
        Vehicle v1 = new Bike(5);
        Vehicle v2 = new Car(10);
        Vehicle v3 = new Truck(10);
        v1.display();
        v2.display();
        v3.display();
    }
}