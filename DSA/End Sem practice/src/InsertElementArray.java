import java.util.Scanner;
public class InsertElementArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter number of elements in array: ");
            int m = sc.nextInt();
            int[] arr = new int[m];
            System.out.print("enter elements in array: ");
            for(int j=0;j<m;j++){
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter element to insert in array: ");
            int el = sc.nextInt();
            System.out.println();
            System.out.print("Enter index to insert at: ");
            int index = sc.nextInt();
            if(index >=m){
                System.out.println("Index out of bounds");
            }
            else{
                arr[index] = el;
                for(int j=0;j<m;j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();

        }
    }
}