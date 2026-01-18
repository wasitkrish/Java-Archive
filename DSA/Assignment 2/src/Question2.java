import java.sql.SQLOutput;
import java.util.Scanner;
class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows N : ");
        int N = sc.nextInt();
        System.out.print("Enter number of columns M : ");
        int M = sc.nextInt();
        int size=1*(N*M);
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        int[][] mat = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                mat[i][j]=arr[index++];
            }
        }
        System.out.print("2D array is :\n ");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}