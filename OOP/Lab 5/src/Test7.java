class Product{
    int price;

    Product(int p){
        if(p>0)
            price=p;
        else
            price=1;
    }
    void display(){
        System.out.println("Price= "+price);
    }
}
public class Test7 {
    public static void main(String[] test7){
        Product p1 = new Product(100);
        Product p2 = new Product(200);
        p1.display();
        p2.display();
    }
}