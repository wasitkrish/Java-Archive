abstract class Notification{
    abstract void send();
}
class Email extends Notification{
    void send(){
        System.out.println("Sending email...");
    }
}
public class NotificationSystemAbstract {
    public static void main(String[] args) {
        Notification n = new Email();
        n.send();
    }
}