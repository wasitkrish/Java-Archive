class HeightAnalysis{
    int[][] heights={
            {150,152,148},
            {160,158,155},
            {165,170,168}
    };
    void compute(){
        int max=heights[0][0];
        int sum=0;
        int count=0;
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[i].length;j++){
                sum+=heights[i][j];
                count++;
                if(heights[i][j]>max){
                    max=heights[i][j];
                }
            }
        }
        System.out.println("Maximum height="+max);
        System.out.println("Average height="+(double)sum/count);
    }
    public static void main(String[] args){
        new HeightAnalysis().compute();
    }
}