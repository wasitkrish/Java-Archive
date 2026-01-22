import java.util.Scanner;
public class Question6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers N : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array of "+N+" elements : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        int temp=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                temp=arr[i];

                for(int j=i;j>index;j--){
                    arr[j]=arr[j-1];
                }

                arr[index]=temp;
                index++;
            }
        }
        System.out.print("Rearranged array is: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}