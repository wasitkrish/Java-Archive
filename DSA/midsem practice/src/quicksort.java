public class quicksort{
    static int calculate(int[] arr,int low, int high){
        int pivot=arr[high];
        int j=low-1;
        for(int i=low;i<high;i++){
            if(arr[i]<pivot) {
                j++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        j++;
        int temp=arr[j];
        arr[j]=pivot;
        arr[high]=temp;
        return j;
    }
    static void sortcalc(int[] a,int low, int high){
        if(low<high){
            int n=a.length;
            int pivot = calculate(a,low,high);
            sortcalc(a,pivot+1,high);
            sortcalc(a,low,pivot-1);
            System.out.print("\n Sorted Array Elements are: ");
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
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