import java.util.Scanner;
class calculate {
    void sum(int n, int m) {
        System.out.println("Sum is: " + (n + m));
    }

    void diff(int n, int m) {
        System.out.println("Difference is: " + (n - m));
    }
}
public class dowhileusecase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        calculate aa = new calculate();
        int check;
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        do{
            System.out.println("Select 1 for sum");
            System.out.println("Select 2 for difference");
            System.out.println("select 3 for exiting the loop");
            check = sc.nextInt();
            if (check==1){
                aa.sum(n1,n2);
                break;
            }
            else if(check==2){
                aa.diff(n1,n2);
                break;
            }
            else{
                continue;
            }
        }while(check!=3);
    }
}