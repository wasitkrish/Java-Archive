class VariableComparision{
    int instance=0;
    static int staticvar=0;
    void increment(){
        int localvar=0;
        localvar++;
        instance++;
        staticvar++;
        System.out.println("Instance: "+instance);
        System.out.println("StaticVar: "+staticvar);
        System.out.println("LocalVar: "+localvar);
        System.out.println("------------------------");
    }
}
public class VariableTypes {
    public static void main(String[] args) {
        VariableComparision v = new VariableComparision();
        VariableComparision v2 = new VariableComparision();
        v.increment();
        v2.increment();
        v2.increment();

    }
}