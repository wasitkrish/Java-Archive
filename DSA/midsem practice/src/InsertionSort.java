public class InsertionSort{
    static void sortcalc(int[] A){
        int n=A.length;
        for(int i=1;i<n;i++){
            int key=A[i];
            int j=i-1;
            while(j>=0 && A[j]>key){
                A[j+1]=A[j];
                j=j-1;
            }
            A[j+1]=key;
        }
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