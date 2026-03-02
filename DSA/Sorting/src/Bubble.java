public class Bubble{
    public static void main(String[] args){
        int[] arr = {3,4,7,5,1,2,6,8,9,0};
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}