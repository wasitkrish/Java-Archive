class VariableComparison {
    int instanceVar=0;
    static int staticVar=0;
    void increment(){
        int localVar=0;
        localVar++;
        instanceVar++;
        staticVar++;
        System.out.println("Local: "+localVar);
        System.out.println("Instance: "+instanceVar);
        System.out.println("Static : "+staticVar);
        System.out.println("---------");
    }
    public static void main(String[] args){
        VariableComparison obj1=new VariableComparison();
        VariableComparison obj2=new VariableComparison();
        obj1.increment();
        obj1.increment();
        obj2.increment();

    }
}