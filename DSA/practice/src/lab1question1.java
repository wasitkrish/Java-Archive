import java.sql.SQLOutput;
import java.util.Scanner;
public class lab1question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases T :");
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter size of array N : ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter "+N+" Elements in the array : ");
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            int sum = 0;
            double average = 0;
            for(int j=0; j<N;j++){
                sum=sum+arr[j];
            }
            average =(double)sum/N;
            System.out.println("Sum of elements: "+sum+", average: "+average);
        }
        sc.close();
    }
}