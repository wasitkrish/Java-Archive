import java.util.Scanner;
public class manualQuestion1 {
    public static int BinarySearch (int[] arr,int target){
        return 0;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter sorted elements in array : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int index = BinarySearch(arr,target);
    }
}