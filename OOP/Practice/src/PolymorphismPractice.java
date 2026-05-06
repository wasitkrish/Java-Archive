interface doesWork{
    public void doWork();
    public void sayTrue();
}
class Checker implements doesWork{
    private String nm;
    private int ag;
    private boolean avl;
    Checker(String name, int Age){
        this.nm=name;
        this.ag=Age;
        this.avl=false;
    }
    public String getName(){
        return nm;
    }
    public int getAge(){
        return ag;
    }
    public boolean getAvl(){
        return avl;
    }
    public boolean setAvl(){
        return avl;
    }
    public void display(){
        System.out.println("Name: "+nm);
        System.out.println("Age: "+ag);
        System.out.println("Avl: "+setAvl());
        doWork();
        sayTrue();
        System.out.println();
    }
    public void doWork(){
        System.out.println("Nothing in base class");
    }
    public void sayTrue(){
        System.out.println("Npothing in base class so Nope");
    }
}
class boy extends Checker implements doesWork{
    boy(String name, int Age){
        super(name,Age);
    }
    public boolean setAvl(){
        boolean b = getAvl();
        if(!b){
            b=true;
        }
        return b;
    }
    public void doWork(){
        System.out.println("Does not work");
    }
    public void sayTrue(){
        System.out.println("Nope wont say true");
    }
}
class girl extends Checker implements doesWork{
    girl(String name, int Age){
        super(name,Age);
    }
    public boolean setAvl(){
        boolean b = getAvl();
        return b;
    }
    public void doWork(){
        System.out.println("Does work");
    }
    public void sayTrue(){
        System.out.println("Says yes");
    }
}
public class PolymorphismPractice{
    public static void main(String[] args){
        Checker b = new boy("Krish",20);
        Checker g = new girl("Emily",20);
        Checker base = new Checker("TestSubject",100);
        b.display();
        g.display();
        base.display();
    }
}