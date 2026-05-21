import mypackage.package1;
public class packageread{
    public  static void main(String[] args){
        package1 p = new package1();
        System.out.println("Package operation performed: "+p.getOps());
        System.out.println("Sum: "+p.add(1,2));
        System.out.println("Difference:  "+p.sub(69,(6+9)));
        System.out.println("Package operation performed: "+p.getOps());
    }
}