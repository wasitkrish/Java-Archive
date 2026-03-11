class con{
    private int first;
    private int second;
    private String name;
    public con(int a, int b, String n){
        this.first=a;
        this.second=b;
        this.name=n;
    }
    public con(int a, int b){
        this(a,b,"Krish");
    }
    public void display(){
        System.out.println(first+" "+second+" and "+name);
    }
}
public class constructoroverloading{
    public static void main(String[] args){
        con a = new con(2,2,"salan");
        con b = new con(4,4,"niranjan");
        con c = new con(5,5);
        a.display();
        b.display();
        c.display();
    }
}