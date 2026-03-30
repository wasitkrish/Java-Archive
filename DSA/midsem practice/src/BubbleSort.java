public class BubbleSort{
    static void sortcalc(int[] A){
        int n=A.length;
        int count=0;
        boolean flag;
        for(int i=0;i<n-1;i++){
            flag=true;
            for(int j=1;j<n-i;j++){
                if(A[j-1]>A[j]){
                    int temp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=temp;
                    count++;
                    flag=false;
                }
            }
            if(flag){
                System.out.println("\n Array already sorted");
                break;
            }
        }
        System.out.print("Total number of swaps performed is: "+count);
        System.out.print("\n Topper is : "+A[n-1]);
        System.out.print("\n Lowest is : "+A[0]);
        System.out.print("\n Sorted Array Elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] a1 ={34, 12, 5, 66, 1, 89, 23};
        int[] a2 ={2, 5, 8, 12, 16, 23, 38};
        int[] a3 ={50, 40, 30, 20, 10, 5, 1};
        int[] a4 ={4, 2, 7, 2, 9, 4, 1};
        int[] a5 ={-5, 12, 0, -3, 8, -1};
        sortcalc(a1);
        System.out.println();
        sortcalc(a2);
        System.out.println();
        sortcalc(a3);
        System.out.println();
        sortcalc(a4);
        System.out.println();
        sortcalc(a5);
        System.out.println();

    }
}