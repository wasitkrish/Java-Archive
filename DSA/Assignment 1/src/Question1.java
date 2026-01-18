import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arrays : ");
        int T = sc.nextInt();
        int[] sum = new int[T];
        int[] avg = new int[T];
        for (int i = 0; i < T; i++) {
            int temp = 0;
            System.out.print("Enter number of elements : ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter array elements : ");
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                temp = temp + arr[j];
            }
            sum[i] = temp;
            avg[i] = temp / N;
        }
        for (int i = 0; i < T; i++) {
            System.out.println("Sum = " + sum[i] + ", Average = " + avg[i]);
        }
    }
}