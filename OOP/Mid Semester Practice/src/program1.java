
abstract class Drone{
    private int droneID;
    private double batteryLevel;
    private double maxPayloads;
    Drone(int id,double bat, double payload){
        this.droneID=id;
        this.batteryLevel=bat;
        this.maxPayloads=payload;
    }
    public int getID(){
        return droneID;
    }
    public double getBatLvl(){
        return batteryLevel;
    }
    public double getPayloads(){
        return maxPayloads;
    }
    abstract String startMission();
    public void chargeBattery(int amount){
        double newbat = batteryLevel+amount;
        if(amount < 0){
            System.out.println("Invalid charge amount");
            return;
        }
        if(newbat>100){
            batteryLevel=100;
        }
        else{
            batteryLevel=newbat;
        }
    }
    public void display(){
        System.out.println("DroneId : "+droneID);
        System.out.println("Battery level: "+batteryLevel);
        System.out.println("Max Payload: "+maxPayloads);
        System.out.println("Mission Status"+startMission());

    }
}
class FoodDeliveryDrone extends Drone{
    FoodDeliveryDrone(int id,double bat, double payload){
        super(id,bat,payload);
    }
    public String startMission(){
        return "Mission prioritizing speed";
    }

}
class MedicalSupplyDrone extends Drone{
    MedicalSupplyDrone(int id,double bat, double payload){
        super(id,bat,payload);
    }
    public String startMission(){
        return "Mission prioritizing safety";
    }

}
class SurveillanceDrone extends Drone{
    SurveillanceDrone(int id,double bat, double payload){
        super(id,bat,payload);
    }
    public String startMission(){
        return "Mission prioritizing Surveillance area";
    }
}
public class program1{
public static void main(String[] args){
    Drone[] obj = new Drone[3];
    obj[0]=new FoodDeliveryDrone(102,40,100);
    obj[1]=new MedicalSupplyDrone(101,40,100);
    obj[2]=new SurveillanceDrone(104,40,100);
    for(int i=0; i<3;i++){
        obj[i].display();
    }
    for(int i=0;i<3;i++){
        obj[i].chargeBattery(50);
    }
}
}