interface Ainst {
    void show();
}

interface Binst {
    void display();
}

class Cinst implements Ainst, Binst {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
public class MultipleInheritanceInstances{
    public static void main(String[] args){
        Cinst instance = new Cinst();
        instance.show();
        instance.display();
    }
}