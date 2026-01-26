class MarksAnalysis{
    int[][][] marks={
            { //class 1
                    {80,85}, //student 1 subject 1 and 2
                    {70,75} // student 2 subject 1 and 2
            },
            { // class 2
                    {90,95}, // student 1 subject 1 and 2
                    {88,92} // student 2 subject 1 and 2
            }
    };
    void compute(){
        for(int clss=0;clss<marks.length;clss++){
            for(int student=0;student<marks[clss].length;student++){
                int total=0;
                for(int subject=0;subject<marks[clss][student].length;subject++){
                    total+=marks[clss][student][subject];
                }
                System.out.println("Class "+clss+" Student "+student+" total= "+total);
            }
        }
    }
    public static void main(String[] args){
        new MarksAnalysis().compute();
    }
}