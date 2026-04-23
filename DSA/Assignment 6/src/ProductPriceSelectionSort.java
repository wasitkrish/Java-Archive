public class ProductPriceSelectionSort {
    public static void main(String[] args) {
        Test t = new Test();
        int[][] data = t.a;
        for (int all = 0; all < data.length; all++) {
            int n= data[all].length;


            int comp=0;
            for (int i = 0; i < n; i++) {
                int minindex = i;
                for (int j = i + 1; j < n; j++) {
                    if(data[all][j]<data[all][minindex]){
                        minindex=j;
                        comp++;
                    }
                }
                if(minindex!=i){
                    int temp= data[all][minindex];
                    data[all][minindex]=data[all][i];
                    data[all][i]=temp;
                }
            }
            System.out.println("Sorted Array "+all+" is: ");
            for(int i=0;i<n;i++){
                System.out.print(data[all][i]+" ");
            }
            System.out.println();
            System.out.println("Number of comparisons made is: "+comp);
            System.out.println();
        }
    }
}