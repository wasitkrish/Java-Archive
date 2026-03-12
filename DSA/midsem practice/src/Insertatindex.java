import java.util.Scanner;
public class Insertatindex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();
        for(int i =0 ;i<T;i++){
            System.out.print("Enter number of elements in the array: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] t1 = new int[N];
            int[] t2 = new int[N+1];
            System.out.print("Enter elements in the array: ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            System.out.print("Enter element you want to insert: ");
            int key = sc.nextInt();
            System.out.print("Enter index you want to insert at: ");
            int index = sc.nextInt();
            for(int j=0;j<N;j++){
                if(j==index){
                    t1[j]=key;
                }
                else{
                    t1[j]=arr[j];
                }
            }
            for(int j=0;j<N+1;j++){
                if(j<index){
                    t2[j]=arr[j];
                }
                else if(index==j){
                    t2[j]=key;
                }
                else if(j>index){
                    t2[j]=arr[j-1];
                }
            }
            System.out.print("Output for test Case 1:");
            for(int j=0;j<N;j++){
                System.out.print(t1[j]+" ");
            }
            System.out.println();
            System.out.println("Output for test case 2: ");
            for(int j=0;j<N+1;j++){
                System.out.print(t2[j]+" ");
            }
            System.out.println();
        }
    }
}