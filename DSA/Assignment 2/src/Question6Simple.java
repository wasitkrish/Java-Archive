import java.util.Scanner;
public class Question6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer N :");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter "+N+" elements in array : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int[] newarr= new int[N];
        int index=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i]%2!=0){
                newarr[index++]=arr[i];
            }
        }
        System.out.print("New array is : ");
        for(int i=0;i<N;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}