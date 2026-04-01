abstract class PaymentB{
    double amount;
    PaymentB(double amt){
        this.amount=amt;
    }
    abstract void pay();
}
class UPI  extends PaymentB{
    String upiId;
    UPI(double amt,String upiId){
        super(amt);
        this.upiId=upiId;
    }
    void pay(){
        System.out.println("UPI payment : "+amount+" using "+upiId);
    }
}
public class PaymentProcessingPartB {
    public static void main(String[] args) {
        PaymentB p = new UPI(5000,"abstract@oksbi");
        p.pay();

    }
}