class Payment{
    double amount;
    void pay(){
        System.out.println("Processing payment of: "+amount);
    }
}
class UPI extends Payment{
    String upiID;
    UPI(double amount, String upiID){
        this.amount=amount;
        this.upiID=upiID;
    }
}
class CreditCard extends Payment{
    String cardNumber;
    CreditCard(double amount, String cardNumber){
        this.amount=amount;
        this.cardNumber=cardNumber;
    }
}
public class PaymentWithoutAbstract {
    public static void main(String[] args) {
        Payment c = new Payment();
        Payment[] arr = new Payment[2];
        arr[0]=new UPI(5000,"1234@oksbi");
        arr[1]=new CreditCard(5000,"BLAIU4AID25072");
        for(int i=0;i<arr.length;i++){
            arr[i].pay();

        }
        c.pay();
    }
}