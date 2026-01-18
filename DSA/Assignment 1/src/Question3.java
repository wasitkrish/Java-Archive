import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of arrays : ");
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.print("\n Enter number of elements in the array "+(i+1)+" : ");
            int T=sc.nextInt();
            int[] arr=new int[T];
            System.out.print("Enter elements in the array : ");
            for(int j=0;j<T;j++){
                arr[j]=sc.nextInt();
            }
            int[] rev= new int[T];
            for(int j=0;j<T;j++){
                rev[j]=arr[T-1-j];
            }
            System.out.print("Reversed array : ");
            for(int j=0;j<T;j++){
                System.out.print(rev[j]+" ");
            }
        }
        sc.close();
    }
}