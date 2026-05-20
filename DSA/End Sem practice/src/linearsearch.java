import java.util.Scanner;
import java.util.Stack;

public class linearsearch {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print("Enter number of elements in array "+(i+1)+": ");
            int m = sc.nextInt();
            int[] arr = new int[m];
            System.out.print("Enter elements in array : ");
            for(int j=0;j<m;j++){
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter element to search in array: ");
            int key = sc.nextInt();
            boolean flag = false;
            int kindex = 0;
            for(int j=0;j<m;j++){
                if(key == arr[j]){
                    flag = true;
                    kindex=j;
                    break;
                }
            }
            if(flag){
                System.out.println("element found at index: "+kindex);
            }
            else{
                System.out.println("Element not found in array");
            }
        }
    }
}
