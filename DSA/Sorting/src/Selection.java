public class Selection{
    public static void main(String[] args){
        int[] arr = {1,5,3,4,7,6,8,9,0};
        int temp=0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}