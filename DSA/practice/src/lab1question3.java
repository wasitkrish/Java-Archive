import java.util.Scanner;
public class lab1question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases T : ");
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            long startime = System.nanoTime();
            System.out.print("Enter number of array elements N : ");
            int N= sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter "+N+" elements in the array : ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int[] rev = new int[N];
            for(int j=0;j<N;j++){
                rev[N-j-1]=arr[j];
            }
            System.out.println("Reversed array elements are : ");
            for(int j=0;j<N;j++){
                System.out.print(rev[j]+" ");
            }
            long endtime = System.nanoTime();
            long actual = (endtime-startime)/T;
            System.out.println("\n"+actual);
        }
        sc.close();
    }
}