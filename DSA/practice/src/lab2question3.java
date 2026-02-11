import java.sql.SQLOutput;
import java.util.Scanner;
public class lab2question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter M and N :");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int index=0;
        int[] arr = new int[M*N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[index++]=mat[i][j];
            }
        }
        for(int i=0;i<M*N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}