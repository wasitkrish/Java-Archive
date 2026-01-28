import java.util.Scanner;
public class lab1Question5alt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter the number of elements in array "+(i+1)+" : ");
            int N = sc.nextInt();
            int[] arr =new int[N];
            System.out.print("Enter elements in array "+(i+1)+" : ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            System.out.print("Enter element to delete in array: ");
            int delete = sc.nextInt();
            int index=-1;
            int size=N-1;
            long start=System.nanoTime();
            for(int j=0;j<N;j++){
                if(arr[j]==delete){
                    for(int t=j;t<N-1;t++){
                        arr[t]=arr[t+1];
                    }
                    System.out.print("New Array : ");
                    for(int k=0;k<size;k++){
                        System.out.print(arr[k]+" ");
                    }
                    break;
                }
            }
            long end = System.nanoTime();
            long exec = end-start;
            System.out.println("\n Execution time : "+exec+" ns");
        }
        sc.close();
    }

}