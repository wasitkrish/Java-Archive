import java.util.Scanner;
public class inplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Integers: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.print("enter elements in the array: ");
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int index=0;
        int temp=0;
        for(int i=0;i<N;i++){
            if(A[i]%2==0){
                temp=A[i];
                for(int j=i;j>index;j--){
                    A[j]=A[j-1];
                }
                A[index]=temp;
                index++;
            }
        }
        System.out.println("Rearranged array is : ");
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
        }

    }
}