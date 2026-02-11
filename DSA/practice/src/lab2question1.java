import java.util.Scanner;
import java.util.Random;
public class lab2question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter M and N:");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                mat[i][j]=rand.nextInt(-10,11);
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }

}