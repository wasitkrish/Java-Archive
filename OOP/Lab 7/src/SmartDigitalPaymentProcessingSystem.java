class Payment{
    private String transactionID;
    private String Payer;
    private double FinalAmount;
    Payment(String id,String n,double x){
        this.transactionID=id;
        this.Payer=n;
        this.FinalAmount=x;
    }
    public double calculateFinal(){
        return FinalAmount;
    }
    public String getID(){
        return transactionID;
    }
    public String getName(){
        return Payer;
    }
    public double getAmount(){
        return FinalAmount;
    }
    void display(){
        System.out.println("Transaction ID: "+transactionID);
        System.out.println("Payer: "+Payer);
        System.out.println("Final Amount: "+calculateFinal());
    }
}
class CreditCard extends Payment{
    CreditCard(String id,String n,double x){
        super(id,n,x);
    }
    public double calculateFinal(){
        if(getAmount() >50000){
            return(getAmount()+((0.02)*getAmount())+500);
        }
        else {
            return getAmount();
        }
    }
}
class UPI extends Payment{
    UPI(String id,String n,double x){
        super(id,n,x);
    }
    public double calculateFinal(){
        if(getAmount()>100000){
            return getAmount()-(0.01*getAmount());
        }
        else{
            return getAmount();
        }
    }
}
class Crypto extends Payment{
    Crypto(String id,String n,double x){
        super(id,n,x);
    }
    public double calculateFinal(){
        return getAmount()+(0.05*getAmount());
    }
}
public class SmartDigitalPaymentProcessingSystem{
    public static void main(String[] args){
        Payment[] emp = new Payment[3];
        emp[0]= new CreditCard("TXN101","Arun",60000);
        emp[1]= new UPI("TXN102","Megha",1200000);
        emp[2]= new Crypto("TXN103","Rohit",50000);

        for(int i=0;i<3;i++){
            emp[i].display();
        }
    }
}

