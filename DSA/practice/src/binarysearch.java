import java.util.Scanner;
import java.util.Arrays;
public class binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to search : ");
        int check = sc.nextInt();
        Arrays.sort(arr);
        int high=N-1,mid=N/2,low=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==check){
                System.out.println("element found at index"+mid);
                break;
            }
            if(arr[mid]<check){
                low=mid+1;
            }
            if(arr[mid]>check){
                high=mid-1;
            }

        }
    }
}