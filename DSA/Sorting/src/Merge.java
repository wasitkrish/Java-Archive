public class Merge{
    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start, j=mid+1;
        int l=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[l++]=arr[i++];
            }
            else{
                temp[l++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[l++]=arr[i++];
        }
        while(j<=end){
            temp[l++]=arr[j++];
        }
        for(int k=0;k<temp.length;k++){
            arr[start+k]=temp[k];
        }
    }
    public static void mergesort(int[] arr, int start, int end){
        if(start<end){
            int mid = start + (end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args){
        int[] arr = {3,4,2,1,8,6,7,5,0,9};
        int n=arr.length;
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}