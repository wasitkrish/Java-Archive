import java.util.Scanner;
import java.util.Random;
public class random2dmatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of rows : ");
        int M = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=rand.nextInt(-10,11);
            }
        }
        System.out.println("Random matrix generated is: ");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}