import java.util.Scanner;
public class sumandaveragearray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of arrays you want to have: ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter number of elements in the array "+(i+1)+": ");
            int m = sc.nextInt();
            int[] arr = new int[m];
            System.out.print("Enter elements in the array: ");
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0; float average=0f;
            for(int j=0;j<m;j++){
                sum+=arr[j];
            }
            average=sum/m;
            System.out.println("Sum of elements: "+sum);
            System.out.println("Average of elements: "+average);
        }
    }
}