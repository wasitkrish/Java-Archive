import java.util.Random;
import java.util.Scanner;
public class BinarySearchTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] N = {5000,6000,7000,8000,9000,10000};
        for(int i=0;i<N.length;i++){
            int[] arr = new int[N[i]];
            for(int j=0;j<N[i];j++){
                arr[j]=rand.nextInt(-N[i],N[i]);
            }
            System.out.print("Enter element to search: ");
            int key = sc.nextInt();
            double start= System.nanoTime();
            int low=0;
            int high=arr.length-1;
            for(int j=0;j<N[i];j++){
                int mid = low + (high-low)/2;
                if(arr[mid]==key){
                    System.out.println("Element found at index: "+j);
                }
                else if(arr[mid]>key){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            double end = System.nanoTime();
            double time = end - start;
            System.out.println("Calculation Time is: "+time);
        }

    }
}
