abstract class Notificationn{
    abstract void send();
}
class Emaill extends Notificationn{
    void send(){
        System.out.println("Sending Email");
    }
}
class SMSs extends Notificationn{
    void send(){
        System.out.println("Sending SMS");
    }
}
class Pushh extends Notificationn{
    void send(){
        System.out.println("Sending Push Notification");
    }
}

public class NotificationSystemWithAbstract{
    public static void main(String[] args){
        // Notificationn n = new Notificationn(); -> cannot create object of abstract class
        Notificationn[] arr = new Notificationn[3];
        arr[0] = new Emaill();
        arr[1] = new SMSs();
        arr[2] = new Pushh();
        for(int i=0;i<arr.length;i++){
            arr[i].send();
        }
    }
}