import java.util.Scanner;
import java.util.Random;
class Question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of rows N : ");
        int N = sc.nextInt();
        System.out.print("Enter number of columns M : ");
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                mat[i][j] = rand.nextInt(-10,11);
            }
        }
        System.out.print("The Matrix is :\n");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}