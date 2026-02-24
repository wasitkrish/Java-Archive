class Random{
    static int num1;
    int num2;
    Random(){
    }
    void calculate(){
        for(int i=0;i<5;i++) {
            num1++;
            num2++;
        }

    }
    void display1(){
        System.out.println(num1);
        System.out.println(num2);
    }
}

public class labeval1{
    public static void main(String[] args){
        Random n1 = new Random();
        Random n2 = new Random();
        n1.calculate();
        n2.calculate();
        n1.display1();
        n2.display1();
    }
}