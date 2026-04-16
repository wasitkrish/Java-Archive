public class StudentMarksBubbleSort{
    public static void main(String[] args){
        Test t = new Test();
        int[][] data = t.a;
        for(int i=0;i<data.length;i++){
            int l = data[i].length;
            int swaps=0;
            int passes=0;
            for(int j = 0;j<l-1;j++){
                boolean swapped=false;
                for(int k = 1; k<l-j;k++){
                    if(data[i][k-1]>data[i][k]){
                        int temp = data[i][k];
                        data[i][k]=data[i][k-1];
                        data[i][k-1]=temp;
                        swaps++;
                        swapped=true;
                    }
                }
                passes++;
                if(!swapped){
                    System.out.println("Array "+i+" is already sorted no need to sort further");
                    System.out.println("Number of passes = "+passes);
                    System.out.println();
                    break;

                }
            }
            System.out.println("Sorted Array "+i+" is:");
            for(int p=0;p<l;p++){
                System.out.print(data[i][p]+" ");
            }
            System.out.println();
            System.out.println("Number of Swaps performed: "+swaps);
            System.out.println("Topper marks= "+data[i][l-1]+" and Lowest marks= "+data[i][0]);
            System.out.println("Number of passes = "+passes);
            System.out.println();

        }
    }
}