class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}
public class testing{
    public static void main(String[] args){
        B obj = new B();
        obj.display();
        obj.show();
    }
}