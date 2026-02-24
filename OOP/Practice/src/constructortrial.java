class Node{
    String n;
    Node(String name){
        this.n=name;
    }
}
class get extends Node{
    private get(String n){
        super(n);
    }
    static get method(String n){
        return new get(n);
    }
    void display(){
        System.out.println(n);
    }
}
public class constructortrial{
    public static void main(String[] args){
        get obj=get.method("Krish");
        obj.display();
    }
}