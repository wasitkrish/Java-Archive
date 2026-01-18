import java.util.Scanner;
public class Question4input1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arrays you want : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.print("\n Enter the number of elements in array "+(i+1)+" : ");
            int T = sc.nextInt();
            int[] arr = new int[T];
            System.out.print("Enter the elements in the array : ");
            for(int j=0;j<T;j++){
                arr[j]= sc.nextInt();
            }
            System.out.print("Enter the element you want to add: ");
            int add = sc.nextInt();
            System.out.print("enter the index of the new element: ");
            int index = sc.nextInt();
            arr[index]=add;
            System.out.print("New elements in the array is: ");
            for(int j=0;j<T;j++){
                System.out.print(arr[j]+" ");
            }
        }
        sc.close();
    }
}