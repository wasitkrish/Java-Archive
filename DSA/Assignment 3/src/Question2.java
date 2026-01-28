import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] N={5, 10, 20, 50, 100, 200, 500};
        System.out.print("Enter elements to search for N size : ");
        int search=sc.nextInt();
        try(FileWriter csvWriter = new FileWriter("/home/krish/Desktop/Java-Archive/DSA/Assignment 3/plots/Question23.csv")) {
            csvWriter.append("N,ExecutionTime\n");
            for (int i = 0; i < N.length; i++) {
                int count = 0;
                int iteration=500;
                double total=0;
                int[] arr = new int[N[i]];
                for (int j = 0; j < N[i]; j++) {
                    arr[j] += j+1;
                }
                boolean check=false;
                int index=0;
                for(int itr=0;itr<iteration;itr++) {
                    long starttime = System.nanoTime();
                    for (int j = 0; j < N[i]; j++) {
                        if (arr[j] == search) {
                            check=true;
                            index=j;
                            break;
                        }
                    }
                    long endtime = System.nanoTime();
                    total+=endtime-starttime;
                }
                if(check)
                    System.out.println("Element found at index : " + index);
                double averagetime=total/iteration;
                System.out.println("Exeution time : " + averagetime + " ns \n");
                csvWriter.append(N[i]+","+averagetime+"\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
