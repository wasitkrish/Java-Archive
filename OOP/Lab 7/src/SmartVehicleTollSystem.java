class Vehicle {
    private String vehicleno;
    double basetoll=0;
    Vehicle(String vn){
        this.vehicleno=vn;
    }
    public String getVehicleno(){
        return vehicleno;
    }
    void display(){
        System.out.print("Vehicle no :"+vehicleno);
        System.out.print("Toll to be paid : "+calculatetoll());
        System.out.print("\n");
    }
    public double calculatetoll(){
        return basetoll;
    }

}
class car extends Vehicle{
    car(String vn){
        super(vn);
    }
    public double calculatetoll(){
        return basetoll+100;
    }
}
class truck extends Vehicle{
    truck(String vn){
        super(vn);
    }
    public double calculatetoll(){
        return basetoll+300;
    }
}
class electricCar extends Vehicle{
    electricCar(String vn){
        super(vn);
    }
    public double calculatetoll(){
        return basetoll+50;
    }
}
public class SmartVehicleTollSystem{
    public static void main(String[] args){
        Vehicle[] vh = new Vehicle[3];
        vh[0]=new car("KA01AB1234");
        vh[1]=new truck("KA05CD5678");
        vh[2]=new electricCar("KA09EF9999");
        for(int i=0;i<3;i++){
            vh[i].display();
        }
    }

}

