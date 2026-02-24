class oneD{
    int[] oned = {1,2,3,4,5,6,7,8,9,10}; // number of customers in a resturant for 10 days
    int count;
    int sum;
    double avg;
    public void calculate(){
        for(int i=0;i<oned.length;i++){
            sum+=oned[i];
            count++;
        }
        avg=(double)sum/count;
    }
    public void display(){
        System.out.println("Number of customers : "+count);
        System.out.println("Total customers in 10 days: "+sum);
        System.out.println("Average customers in 10 days: "+avg);
    }
}
class twoD{
    int[][] twod = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}  //Students and there marks in 5 subjects
    };
    int count;
    int sum;
    int rowsub,std;
    int overallmax;
    int student,subject;
    int highest;
    public void calculate(){
        for(int i=0;i<twod.length;i++){
            int rowmax=0;
            for(int j=0;j<twod[i].length;j++){
                if(twod[i][j]>rowmax) {
                    rowmax = twod[i][j];
                    rowsub=j;
                }
                if(twod[i][j]>highest) {
                    highest = twod[i][j];
                    student=i; subject=j;
                }
                sum+=twod[i][j];
            }
            System.out.print("Student "+i+" got highest marks: "+rowmax+" in subject "+rowsub);
            if(sum>overallmax) {
                overallmax = sum;
                std=i;
            }
            count++;
        }
    }
    public void display(){
        System.out.println("Number of total entries: "+count);
        System.out.print("Student "+std+" has the highest overall score of : "+overallmax);
    }
}
class threeD{
    int[][][] threed = { // schools -> class -> event participants
            {
                    {1,2,3},
                    {4,5,6},
                    {4,7,8}
            },
            {
                    {7,8,9},
                    {10,11,12},
                    {9,7,6}
            }
    };
    int count,indexsc,clsc,evsc;
    int schigh,scavg,clavg,clhigh,evhigh,evavg,scsum,clsum,evsum;
    public void calculate(){
        for(int i=0;i<threed.length;i++){
            int clcount=0;
            for(int j=0;j<threed[i].length;j++){
                int index=0;
                int evcount=0;
                evsum=0;
                evavg=0;
                for(int k=0;k<threed[i][j].length;j++){
                    if(threed[i][j][k]>evhigh){
                        evhigh=threed[i][j][k];
                        index=k;
                    }
                    evsum+=threed[i][j][k];
                    evcount++;
                }
                System.out.print("Highest participants of school "+i+" and class "+j+" were in event day: "+index+" numbered "+evhigh);
                System.out.print("Total participants in that event were: "+evhigh);
                System.out.print("Average participants in event"+j+" were: "+(evsum/evcount));
                System.out.print("-------------------------------------------------");
            }
        }
    }
}
public class labarray{
    public static void main(String[] args){
        oneD one = new oneD();
        twoD two = new twoD();
        threeD three = new threeD();
        one.calculate();
        one.display();
        two.calculate();
        two.display();
        three.calculate();
    }
}