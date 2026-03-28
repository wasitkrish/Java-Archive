abstract class Paymentt{
    double amount;
    Paymentt(double amount){
        this.amount=amount;
    }
    abstract void pay();
}class UPII extends Paymentt{
    String upiID;
    UPII(double amount, String upiID){
        super(amount);
        this.upiID=upiID;
    }
    void pay(){
        System.out.println("UPI Payment: "+amount+" using "+upiID);
    }
}
class CreditCardd extends Paymentt{
    String cardNumber;
    CreditCardd(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }
    void pay(){
        System.out.println("Card Payment: "+amount+" using "+cardNumber);
    }
}
public class PaymentWithAbstract{
    public static void main(String[] args){
        // Paymentt c = new Paymentt(6000); using abstract class cant create object of the abstract class
        Paymentt[] arr = new  Paymentt[2];
        arr[0]= new UPII(5000,"1234@oksbi");
        arr[1]=new CreditCardd(5000,"BLAIU4AID25072");
        for(int i=0;i<arr.length;i++){
            arr[i].pay();
        }
    }
}