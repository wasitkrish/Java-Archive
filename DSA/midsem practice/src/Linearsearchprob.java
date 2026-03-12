import java.util.Scanner;
public class Linearsearchprob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of test cases: ");
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter number of elements in array: ");
            int N= sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter elements in the array: ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            System.out.print("Enter element to search in array: ");
            int key = sc.nextInt();
            boolean flag=false;
            int index=0;
            for(int k=0;k<N;k++){
                if(arr[k]==key){
                    index=k;
                    flag=true;

                }
                else{
                    continue;
                }
            }
            if(flag){
                System.out.println("Element found at index: "+index);
            }
            else{
                System.out.println("Element not found !");
            }

        }

    }
}