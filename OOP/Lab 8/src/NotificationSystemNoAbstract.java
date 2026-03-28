class Notification{
    void send(){
        System.out.println("Sending notification");
    }
}
class Email extends Notification{}
class SMS extends Notification{}
class Push extends Notification{}

public class NotificationSystemNoAbstract {
    public static void main(String[] args) {
        Notification e = new Notification();
        Notification[] arr = new Notification[3];
        arr[0] = new Email();
        arr[1] = new SMS();
        arr[2] = new Push();
        for (int i = 0; i < arr.length; i++) {
            arr[i].send();
        }
        e.send();
    }
}