class ArrayTestOperations{
    int[][] arr={
        {2,4,6},
        {1,3,5},
        {7,8,9}
    };
    void computeRowDetails(){
        int totalSum=0;
        int highest=0;
        int hrow=0;
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            int rowMax=0;
            int average=0;
            int even=0;
            int odd=0;
            for(int j=0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
                totalSum+=arr[i][j];
                if(arr[i][j]>rowMax){
                    rowMax=arr[i][j];
                }
                if(arr[i][j]%2==0){
                    even++;
                }
                else {
                    odd++;
                }
            }
            average=rowSum/arr[i].length;
            System.out.println("Row "+i+" Sum= "+rowSum+", Max="+rowMax+", Average= "+average+", Even count= "+even+", odd count= "+odd);
            if(rowSum>highest){
                highest=rowSum;
                hrow=i;
            }
        }
        System.out.println("\n total Sum = "+totalSum+", Highest Sum is: "+highest+" of row: "+(hrow+1));
    }
    public static void main(String[] args){
        ArrayTestOperations obj = new ArrayTestOperations();
        obj.computeRowDetails();
    }

}