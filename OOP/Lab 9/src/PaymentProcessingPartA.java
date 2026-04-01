class Payment{
    double amount;
    void pay(){
        System.out.println("Processing Payment of "+amount);
    }
}
public class PaymentProcessingPartA {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay();
    }
}