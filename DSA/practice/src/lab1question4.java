import java.util.Scanner;
public class lab1question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Test cases T : ");
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter number of array elements N : ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] arr2 = new int[N+1];
            System.out.print("enter elements in the array : ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
                arr2[j]=arr[j];
            }
            int index,elem;
            System.out.print("Enter element you want to insert : ");
            elem = sc.nextInt();
            System.out.print("enter index where you want to insert the element : ");
            index = sc.nextInt();
            System.out.println("for input case 2 :");
            for(int j=0;j<N+1;j++){
                if(j<index)
                    arr2[j]=arr[j];
                else if(j==index) {
                    arr2[j] = elem;
                }
                else
                    arr2[j]=arr[j-1];
            }
            System.out.println("The appended arrays are : ");
            for(int j=0;j<N;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println("\n");
            for(int j=0;j<N+1;j++){
                System.out.print(arr2[j]+" ");
            }


        }
        sc.close();
    }
}