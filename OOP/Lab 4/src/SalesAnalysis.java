class SalesAnalysis{
    int[][] sales={
            {10,12,15,11},
            {8,9,10,12},
            {14,13,16,15}
    };
    void compute(){
        for(int i=0;i<sales.length;i++){
            int sum=0;
            for(int j=0;j<sales[i].length;j++){
                sum+=sales[i][j];
            }
            System.out.println("Product "+i+" total sales: "+sum);
        }
    }

    public static void main(String[] args){

        new SalesAnalysis().compute();

    }
}