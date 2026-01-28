import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Question3{
    public static void main(String[] args){
        int[] N={5,10,20,50,100,200,500};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);
        try(FileWriter csvWriter = new FileWriter("/data/Question3.csv")) {
            csvWriter.append("N,Execution Time \n");
            System.out.print("Enter a number to check : ");
            int check = sc.nextInt();
            for (int k = 0; k < N.length; k++) {
                int pairs=0;
                int iterations=500;
                long total=0;
                int[] arr = new int[N[k]];
                for (int j = 0; j < N[k]; j++) {
                    arr[j] = rand.nextInt(N[k]);
                }
                for(int itr=0;itr<iterations;itr++){
                    long startime = System.nanoTime();
                for (int i = 0; i < N[k] - 1; i++) {
                    for (int j = i + 1; j < N[k]; j++) {
                        if (arr[i] + arr[j] == check) {
                            pairs++;
                        }
                    }
                }
                    long endtime = System.nanoTime();
                    total+=endtime-startime;
            }
                double averagetime = total/iterations;
                System.out.println("Number of valid pairs: " + pairs/iterations);
                csvWriter.append(N[k]+","+averagetime+"\n");
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        sc.close();

    }
}