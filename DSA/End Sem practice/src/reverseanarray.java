import java.util.*;
public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements no of arrays: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter number of elements in array: ");
            int m = sc.nextInt();
            int[] arr = new int[m];
            int[] rev = new int[m];
            System.out.print("Enter elements in the array: ");
            for(int j=0;j<m;j++){
                arr[j] = sc.nextInt();
            }
            for(int j=0;j<m;j++){
                rev[m-1-j]=arr[j];
            }
            System.out.print("Reverse of array is: ");
            for(int j=0;j<m;j++){
                System.out.print(rev[j]+" ");
            }
            System.out.println();
        }
    }
}