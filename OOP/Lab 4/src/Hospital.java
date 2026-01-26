class Hospital{
    int[][][] occupancy={
            {
                    {46,50,45},
                    {45,46,48},
                    {45,48,44}
            },
            {
                    {39,35,38},
                    {40,29,40},
                    {40,40,39}
            },
            {
                    {55,44,45},
                    {45,48,47},
                    {45,46,49}
            }
    };
    void compute(){
        int max=occupancy[0][0][0];
        int ovward=0, ovday=0, ovtime=0;
        boolean stress=false;
        for(int ward=0;ward<occupancy.length;ward++){
            int sum=0;
            int count=0;
            for(int day=0;day<occupancy[ward].length;day++) {
                for (int time = 0; time < occupancy[ward][day].length; time++) {
                    sum += occupancy[ward][day][time];
                    count++;
                    if (occupancy[ward][day][time] > max) {
                        max = occupancy[ward][day][time];
                        ovward = ward;
                        ovday = day;
                        ovtime = time;
                    }
                }
            }

            double average=(double)sum/count;
            System.out.println("Ward "+ward+" overloaded= "+(average>=45));
        }
        for(int day=0;day<occupancy[0].length;day++){
            int sum=0;
            int count=0;
            for(int ward=0;ward<occupancy.length;ward++){
                for(int time=0;time<occupancy[ward][day].length;time++) {
                    sum+=occupancy[ward][day][time];
                    count++;
                }
            }
            double dayavg=(double)sum/count;
            if(dayavg>40) {
                stress = true;
                break;
            }

        }
        System.out.println("Hospital under stress= "+stress);
        System.out.println("Maximum Occupancy= "+max+" Ward "+ovward+" Day "+ovday+" Time "+ovtime);
    }
    public static void main(String[] args){
        new Hospital().compute();
    }


}