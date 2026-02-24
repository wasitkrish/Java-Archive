class Variable{
    static int id;
    int amount;
    public String name(){
        String namee="krish";
        return namee;
        }

    }

class AcessTest{
    void display(){
        Variable obj = new Variable();
        System.out.println(obj.amount);
        System.out.println(Variable.id);
        System.out.println(obj.name());
    }
}
public class variabledemo{
    public static void main(String[] args){
        Variable stable = new Variable();
        stable.id= 101;
        stable.amount=10000000;
        AcessTest test = new AcessTest();
        System.out.println(stable.amount);
        test.display();
    }
}