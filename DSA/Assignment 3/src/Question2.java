import java.util.Scanner;
public class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] N={5, 10, 20, 50, 100, 200, 500};
        for(int i=0;i<N.length;i++){
            int count=0;
            int[] arr=new int[N[i]];
            for(int j=0;j<N[i];j++){
                arr[j]+=count;
            }
            System.out.print("Enter elements to search for N size "+N[i]+" : ");
            int search=sc.nextInt();
            long start=System.nanoTime();
            for(int j=0;j<N[i];j++){
                if(arr[j]==search){
                    System.out.println("Element found at index : "+j);
                    break;
                }
            }
            long end = System.nanoTime();
            long exec= end-start;
            System.out.println("Exeution time : "+exec+" ns \n");

        }
        sc.close();
    }
}