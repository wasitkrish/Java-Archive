import java.util.Random;
import java.util.Scanner;
 class reaarangeauxilliary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of Integers: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter elements in the array: ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int[] evenarr = new int[N];
        int[] oddarr = new int[N];
        int[] sort = new int[N];
        int odd=0;
        int even=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                evenarr[even++]=arr[i];
            }
            else{
                oddarr[odd++]=arr[i];
            }
        }
        int index=0;
        for(int i=0;i<even;i++){
            sort[index++]=evenarr[i];
        }
        for(int i=0;i<odd;i++){
            sort[index++]=oddarr[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(sort[i]+" ");
        }

    }
}