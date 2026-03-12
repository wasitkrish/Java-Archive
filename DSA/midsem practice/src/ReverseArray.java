import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: " );
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter number of elements in array: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter elements in the array: ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int[] rev = new int[N];
            for(int j=0;j<N;j++){
                rev[N-1-j]=arr[j];
            }
            System.out.println("Reversed array element is : ");
            for(int j=0;j<N;j++){
                System.out.print(rev[j]+" ");
            }
            System.out.println();
        }
    }
}