import java.util.Random;
import java.util.Scanner;
public class array1dtomatrix2d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of rows : ");
        int M = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int N = sc.nextInt();
        int[] arr = new int[M*N];
        for(int i=0;i<M*N;i++){
            arr[i]=rand.nextInt(1,11);
        }
        System.out.println("Created 1D array is: ");
        for(int i=0;i<M*N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int mul =M*N;
        int index=0;
        System.out.println("1D -> 2D array is :");
        for(int i=0;i<mul/N;i++){
            for(int j=0;j<mul/M;j++){
                System.out.print(arr[index++]+" ");
            }
            System.out.println();
        }

    }
}