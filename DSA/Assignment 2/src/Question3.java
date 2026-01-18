import java.util.Scanner;
class question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows as N : ");
        int N=sc.nextInt();
        System.out.print("Enter the number of columns as M : ");
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        System.out.print("Enter elements in matrix : ");
        for(int i =0 ; i<N; i++){
            for(int j=0;j<M;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int size=N*M;
        int index=0;
        int[] arr=new int[size];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[index++]=mat[i][j];
            }
        }
        System.out.println("The 1D array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}