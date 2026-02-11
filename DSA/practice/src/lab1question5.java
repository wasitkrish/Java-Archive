import java.util.Scanner;
public class lab1question5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int j=0;j<N;j++)
            {
                arr[j] = sc.nextInt();
            }
            System.out.println("enter element you want to delete : ");
            int elem = sc.nextInt();
            int[] temp = new int[N-1];
            int index=0;
            for(int j=0;j<N;j++)
            {
                if(arr[j]==elem)
                   index=j;
            }
            for(int j=0;j<N;j++){
                if(j<index)
                    temp[j] = arr[j];
                else if(j==index)
                    continue;
                else
                    temp[j-1]=arr[j];
            }
            for (int j=0;j<N;j++){
                System.out.println(temp[j]+" ");
            }
        }
    }
}