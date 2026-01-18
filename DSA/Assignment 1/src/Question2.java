import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of arrays you want: ");
        int N= sc.nextInt();
        for(int i=0;i<N;i++){
         System.out.print("\n Number of elements in array "+(i+1)+" : ");
         int T= sc.nextInt();
         int[] arr=new int[T];
         System.out.print("Enter elements in array : ");
         for(int j=0;j<T;j++){
             arr[j]=sc.nextInt();
         }
         int index=0;
         boolean status=true;
            System.out.print("Enter element you want to search: ");
            int search =sc.nextInt();
            for(int j=0;j<T;j++){
                if(search==arr[j]){
                    index=j;
                    status=true;
                    break;
                }
                else{
                    status=false;
                }
            }
            if(status){
               System.out.print("Element"+search+" found at index : "+index) ;
            }
            else{
                System.out.print("Element not found !!");
            }
        }
        sc.close();
    }
}