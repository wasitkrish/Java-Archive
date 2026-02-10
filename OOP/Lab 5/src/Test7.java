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


/** This program demonstrates the use of a constructor for data validation.
 The class Product contains a parameterized constructor that checks whether the input value for price is valid.
 If the value passed is greater than zero, it is assigned to price; otherwise, a default value of 1 is assigned.
 This ensures that every object of the class is initialized with a valid price at the time of object creation.
 The display() method is used to print the price of the product. **/