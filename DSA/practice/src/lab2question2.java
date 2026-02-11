import java.util.Scanner;
public class lab2question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of M and N : ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[M*N];
        System.out.println("enter elements in the 1d array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }int index=0;
        int[][] mat = new int[M][N];
        for(int i=0;i<((N*M)/N);i++){
            for(int j=0;j<((N*M)/M);j++){
                mat[i][j]=arr[index++];
            }
        }
        for(int i=0;i<((N*M)/N);i++){
            for(int j=0;j<((N*M)/M);j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}