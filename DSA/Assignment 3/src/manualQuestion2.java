import java.util.Scanner;
public class manualQuestion2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int[] arr = new  int[N];
        System.out.print("Enter sorted array : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int index = 0;
        boolean flag = false;
        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        //here we start the timer
        long startTime=System.nanoTime();

        for(int i=0;i<N;i++){
            if(arr[i]==target){
                index=i;
                flag=true;
                break;
            }
        }

        //here we end the time count
        long endTime=System.nanoTime();
        long executionTime= endTime-startTime;

        if(flag){
            System.out.println("Element found at the index : "+index);
        }
        else{
            System.out.println("Element not found !");
        }
        System.out.print("Execution time : "+executionTime+" ns");
        sc.close();

    }
}