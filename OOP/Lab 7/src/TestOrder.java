class Order {
    private int orderId;
    private String customerName;
    private double itemPrice;

    Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.itemPrice = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getorderId() {
        return orderId;
    }

    public double getPrice() {
        return itemPrice;
    }

    public double calculateTotal() {
        return itemPrice + 200;
    }
    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Bill: " + calculateTotal());
        System.out.println("\n");
    }
}

    class PrimeOrder extends Order {
        PrimeOrder(int id,String name,double price){
            super(id,name,price);
        }
        public double calculateTotal() {
            return getPrice();
        }
    }

    class InternationalOrder extends Order {
        InternationalOrder(int id,String name,double price){
            super(id,name,price);
        }
        public double calculateTotal() {
            return getPrice() + 1000 + 200;
        }
    }
    public class TestOrder{
    public static void main(String[] args){
        Order[] array = new Order[3];
        array[0]= new Order(101,"Ananya",2000);
        array[1]= new PrimeOrder(102,"Rahul",3000);
        array[2]= new InternationalOrder(103,"Meera",4000);
        for(int i=0;i<array.length;i++){
            array[i].display(); // this is where runtime polymorphism happens.
        }
    }
}