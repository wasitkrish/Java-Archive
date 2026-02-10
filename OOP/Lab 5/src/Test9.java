class Secure{
    private Secure(){
        System.out.println("Private Constructor");
    }
    static Secure createObject(){
        return new Secure();
    }
}
public class Test9{
    public static void main(String[] test9){
        Secure s = Secure.createObject();
    }
}