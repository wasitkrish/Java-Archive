import java.util.Scanner;

public class deletearray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of arrays : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter no of elements in array: ");
            int m = sc.nextInt();
            int[] arr=new int[m];
            System.out.print("Enter elements: ");
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            int[] next = new int[m-1];
            int cindex=0;
            boolean flag=false;
            System.out.print("Enter element to delete from array: ");
            int del = sc.nextInt();
            for(int j=0;j<m;j++){
                if(arr[j]==del){
                    cindex = j;
                    flag =true;
                    break;
                }
            }
            if(!flag){
                System.out.print("element not found in array");
                return;
            }
            for(int j=0;j<m-1;j++){
                if(j<cindex){
                    next[j]=arr[j];
                }
                else if(j>=cindex){
                    next[j]=arr[j+1];
                }
            }
            System.out.print("Array after element deletion is:");
            for(int j=0;j<m-1;j++){
                System.out.print(next[j]+" ");
            }
            System.out.println();
        }
    }
}