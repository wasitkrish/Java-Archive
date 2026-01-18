import java.util.Scanner;
class Question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of N : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] even= new int[N];
        int[] odd=new int[N];
        int evencount=0;
        int oddcount=0;
        int index=0;
        System.out.print("Enter elements in array : ");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                even[evencount++]=arr[i];
            }
            else{
                odd[oddcount++]=arr[i];
            }
        }
        int[] sort=new int[N];
        for(int i=0;i<evencount;i++){
            sort[index++]=even[i];
        }
        for(int i=0;i<oddcount;i++){
            sort[index++]=odd[i];
        }
        for(int i=0;i<N;i++){
            System.out.print(sort[i]+" ");
        }
        sc.close();
    }
}