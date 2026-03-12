import java.util.Scanner;
import java.util.Random;
public class twoDtooneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of rows : ");
        int M = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=rand.nextInt(1,11);
            }
        }
        int mul=M*N;
        int index=0;
        int[] comp = new int[mul];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                comp[index++]=arr[i][j];
            }
        }
        System.out.print("1D array is : ");
        for(int i=0;i<mul;i++){
            System.out.print(comp[i]+" ");
        }
    }
}