public class mergeshort{
    static void mergeshort(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i=low; int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=high){
            temp[k++]=a[j++];
        }
        for(int l=0;l<temp.length;l++){
            a[low+l]=temp[l];
        }
    }
   static void sortcalc(int[] a,int low, int high){
       if(low<high){
           int mid = low +(high-low)/2;
           sortcalc(a,mid+1,high);
           sortcalc(a,low,mid);
           mergeshort(a,low,mid,high);
       }
   }
    public static void main(String[] args){
        int[] a1 ={34, 12, 5, 66, 1, 89, 23};
        int[] a2 ={2, 5, 8, 12, 16, 23, 38};
        int[] a3 ={50, 40, 30, 20, 10, 5, 1};
        int[] a4 ={4, 2, 7, 2, 9, 4, 1};
        int[] a5 ={-5, 12, 0, -3, 8, -1};
        sortcalc(a1,0,a1.length-1);
        System.out.println();
        sortcalc(a2,0,a2.length-1);
        System.out.println();
        sortcalc(a3,0,a3.length-1);
        System.out.println();
        sortcalc(a4,0,a4.length-1);
        System.out.println();
        sortcalc(a5,0,a5.length-1);
        System.out.println();

    }
}