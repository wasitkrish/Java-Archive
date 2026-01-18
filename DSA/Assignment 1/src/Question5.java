import java.util.Scanner;
public class Question5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arrays : ");
        int N = sc.nextInt();
        for( int i=0; i<N; i++){
            System.out.print("\n Enter number of elements in array "+(i+1)+" : ");
            int T = sc.nextInt();
            int[] arr= new int[T];
            System.out.print("Enter elements in array : ");
            for(int j=0;j<T;j++){
                arr[j]=sc.nextInt();
            }
            System.out.print("Enter the element you want to delete: ");
            int del = sc.nextInt();
            int index=-1;
            int[] anew= new int[T-1];
            for(int j=0;j<T;j++){
                if(arr[j]==del){
                    index=j;
                    break;
                }
            }
            for(int j=0;j<T;j++){
                if(j<index){
                    anew[j]=arr[j];
                }
                else if(j==index){
                    continue;
                }
                else{
                    anew[j-1]=arr[j];
                }
            }
            System.out.print("New array is: ");
            for(int j=0;j<T-1;j++){
                System.out.print(anew[j]+" ");
            }
        }
        sc.close();
    }
}