class AttendanceAnalysis {
    int[][] attendance = {
            {1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0},
            {1, 1, 1, 1, 1}
    };

    void compute() {
        for (int i = 0; i < attendance.length; i++) {
            int sum=0;
            for (int j = 0; j < attendance[i].length; j++) {
                sum+=attendance[i][j];
            }
            System.out.println("Student "+i+" attendence="+sum);
        }
    }
    public static void main(String[] args){
        new AttendanceAnalysis().compute();
    }
}