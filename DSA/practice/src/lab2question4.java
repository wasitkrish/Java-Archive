import java.util.Scanner;
public class lab2question4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integere N");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int[] newrr = new int[N];
        int index=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0)
                newrr[index++]=arr[i];
        }
        for(int i=0;i<N;i++){
            if(arr[i]%2!=0)
                newrr[index++]=arr[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(newrr[i]+" ");
        }
    }
}