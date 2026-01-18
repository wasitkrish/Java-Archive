import  java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of arrays you want: ");
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            System.out.print("\n Enter the number of elements in array "+(i+1)+" : ");
            int T = sc.nextInt();
            int[] arr =new int[T];
            System.out.print("Enter the elements in the array : ");
            for(int j=0;j<T;j++){
                arr[j] = sc.nextInt();
            }
            System.out.print("enter the element you want to add : ");
            int add = sc.nextInt();
            System.out.print("enter the index where you want to add the element: ");
            int index = sc.nextInt();
            int[] newar = new int[T+1];
            for(int j=0;j<T+1;j++){
                if(j<index){
                    newar[j]=arr[j];
                }
                else if(index==j){
                    newar[j]=add;
                }
                else{
                    newar[j]=arr[j-1];
                }
            }
            System.out.print("The new array is : ");
            for(int j=0;j<T+1;j++){
                System.out.print(newar[j]+" ");
            }
        }
        sc.close();
    }
}