import java.util.Scanner;
public class Question1{
    public static void main(String[] binary){
        Scanner sc = new Scanner(System.in);
        int[] N={5, 10, 20, 50, 100, 200, 500};
        for(int i=0;i<N.length;i++){
            int[] arr=new int[N[i]];
            for(int j=0;j<N[i];j++){
                arr[j]=j+1;
            }
            System.out.print("Enter a number to search for N="+N[i]+" : ");
            int search = sc.nextInt();
            sc.nextLine();
            int low=0; int high=arr.length-1;
            boolean check=false;
            for(int k=0;k<arr.length;k++){
                int mid=low+(high-low)/2;
                if(search==arr[k]) {
                    System.out.println("Element found at index: " + k);
                    check=true;
                    break;
                }
                if(arr[low]<search)
                    mid=low+1;
                if(arr[high]>search)
                    mid=high-1;
            }
            if(!check)
                System.out.println("Element not found");
        }
        sc.close();
    }
}