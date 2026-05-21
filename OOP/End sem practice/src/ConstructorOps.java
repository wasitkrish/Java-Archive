class nocon{
    String name;
    int id;
    void display(){
        System.out.println("No constructor");
        System.out.println("default name: "+name);
        System.out.println("default id: "+id);
        System.out.println("--------------------------");
    }
}
class chainingcon{
    String name;
    int id;
    chainingcon(){
        this("default",0);
    }
    chainingcon(String name){
        this(name,0);
    }
    chainingcon(int id){
        this("default");
        this.id=id;
    }
    chainingcon(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Chaining Constructor");
        System.out.println("chaining name: "+name);
        System.out.println("chaining id: "+id);
        System.out.println("--------------------------");
    }
}
class convmethod{
    String name;
    convmethod(String name){
        this.name=name;
        System.out.println("Constructor called: "+name);
        System.out.println("--------------------------");
    }
    public void setName(String name){
        this.name=name;
        System.out.println("Setter called: "+name);
        System.out.println("--------------------------");
    }
}
class validcon{
    int price;
    validcon(int price){
        if(price>0){
            this.price=price;
            System.out.println("Valid price set to: "+price);
            System.out.println("--------------------------");
        }
        else{
            this.price=0;
            System.out.println("Invalid price : price set to 0");
            System.out.println("--------------------------");
        }
    }
}
class conacon{
    private conacon(){
        System.out.println("con constructor called");
        System.out.println("--------------------------");
    }
    static conacon returncon(){
        return new conacon();
    }
}
class testvalidcon{
    int id;
    String classname;
    private testvalidcon(){}
    testvalidcon(int id,String classname){
        this.id = id;
        this.classname=classname;
    }
    testvalidcon(int id){
        this(id,"random");
    }
    void display(){
        System.out.println("testing valid constructor using private for default");
        System.out.println("id: "+id);
        System.out.println("classname: "+classname);
        System.out.println("--------------------------");
    }
}
public class ConstructorOps{
    public static void main(String[] args){
        nocon n1 = new nocon();
        n1.display();
        chainingcon c1 = new chainingcon();
        chainingcon c2 = new chainingcon("Krish");
        chainingcon c3 = new chainingcon(20);
        chainingcon c4 = new chainingcon("Sam",40);
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        convmethod v1 = new convmethod("Constructor");
        v1.setName("Changed using methos");
        validcon p1 = new validcon(10);
        validcon p2 = new validcon(-200);
        conacon cn = conacon.returncon();
        testvalidcon ct = new testvalidcon(10);
        testvalidcon ct2 = new testvalidcon(-200,"damncon");
        ct.display();
        ct2.display();


    }
}