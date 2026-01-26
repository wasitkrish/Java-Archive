class TemperatureMonitor{
    int[][][] temperature={
            { //this is for room 1
                    {30,32}, // day 1 temp 1 and 2
                    {33,34} // day 2 temp 1 and 2
            },
            { //this is for room 2
                    {28,29}, // day 1 temp 1 and 2
                    {30,31}, // day 2 temp 1 and 2
            }
    };
    void compute(){
        for(int room=0;room<temperature.length;room++){
            int sum=0;
            int count=0;
            for(int day=0;day<temperature[room].length;day++){
                for(int temp=0;temp<temperature[room][day].length;temp++){
                    sum+=temperature[room][day][temp];
                    count++;
                }
            }
            System.out.println("Room "+room+" average= "+(double)sum/count);
        }
    }
    public static void main(String[] args){
        new TemperatureMonitor().compute();
    }

}