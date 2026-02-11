import java.util.Scanner;
public class lab2question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        int temp=0;
        for(int j=0;j<N;j++) {
            if (arr[j] % 2 == 0) {
                temp = arr[j];
                for(int k=j;k>index;k--){
                    arr[k]=arr[k-1];
                }
                arr[index]=temp;
                index++;

            }
        }
        for(int j=0;j<N;j++){
            System.out.print(arr[j]+" ");
        }
    }
}