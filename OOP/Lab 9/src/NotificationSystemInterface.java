interface Notificationn{
    void send();
}
class SMS implements Notificationn{
    public void send(){
        System.out.println("Sending SMS");
    }
}
public class NotificationSystemInterface {
    public static void main(String[] args) {
        Notificationn n = new SMS();
        n.send();
    }
}