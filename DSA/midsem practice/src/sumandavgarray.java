import java.util.Scanner;
public class sumandavgarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            System.out.print("enter number of elements in the array: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Eneter elements in the array: ");
            for (int i = 0; i < N; i++) {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            double avg=0;
            for (int i = 0; i < N; i++) {
                sum+=arr[i];
            }
            avg=(double)sum/N;
            System.out.println("Sum of elements is: "+sum);
            System.out.println("Average of element is: "+avg);
        }
    }
}
