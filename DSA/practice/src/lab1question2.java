import java.util.Scanner;
public class lab1question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases T : ");
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            System.out.print("Enter number of elements in the array N : ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter "+N+" elements in the array : ");
            for(int j=0;j<N;j++){
                arr[j]=sc.nextInt();
            }
            int check,index=0;
            boolean flag=false;
            System.out.print("enter number to search : ");
            check = sc.nextInt();
            for(int j=0;j<N;j++){
                if(arr[j]==check) {
                    flag = true;
                    index = j;
                }
            }
            if(flag){
                System.out.println("Element "+check+" found at index "+index);
            }
            else
                System.out.println("Element "+check+" was not found in the array");
        }
        sc.close();
    }
}