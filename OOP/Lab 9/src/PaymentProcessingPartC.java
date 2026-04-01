interface PaymentC{
    void pay();
}
class UPIC implements PaymentC{
    double amount;
    String upiID;
    UPIC(double amount,String upiID){
        this.amount=amount;
        this.upiID=upiID;
    }
    public void pay(){
        System.out.println("UPI Payment : "+amount+" using "+upiID);
    }
}
public class PaymentProcessingPartC{
    public static void main(String[] args){
        PaymentC p = new UPIC(500,"interface@oksbi");
        p.pay();
    }
}