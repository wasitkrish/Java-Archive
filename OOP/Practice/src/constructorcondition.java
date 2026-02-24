import java.util.Scanner;
class Demo{
    String n;
    Demo(String name) {
        if (name.equalsIgnoreCase("Krish") || name.startsWith("k")) {
            this.n = name;
        }
        else{
            this.n="Nothing";
        }
    }
    void display(){
        System.out.println(n);
    }
    Demo(){
        this("krish");
    }
}
public class constructorcondition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a name: ");
        String ln = sc.nextLine();
        Demo obj = new Demo(ln);
        Demo obj2 = new Demo();
        obj.display();
        obj2.display();
    }
}