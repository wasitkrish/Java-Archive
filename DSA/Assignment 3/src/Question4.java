import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
public class Question4{
    public static void main(String[] args){
        Random rand = new Random();
        int[] N={5,10,20,50,100,200,500};
        try(FileWriter csvWriter = new FileWriter("/data/Question4.csv")){
            csvWriter.append("N,Execution time\n");
        for(int i=0;i<N.length;i++) {
            int[] A = new int[N[i]];
            int[] B = new int[N[i]];
            int[] C = new int[N[i]];
            int count = 0;
            for (int j = 0; j < N[i]; j++) {
                A[j] = rand.nextInt(N[i]);
                B[j] = rand.nextInt(N[i]);
                C[j] = rand.nextInt(N[i]);
            }
            int iteration = 500;
            long total = 0;
            for (int itr = 0; itr < iteration; itr++) {
                long starttime = System.nanoTime();
                for (int l = 0; l < A.length; l++) {
                    for (int j = 0; j < B.length; j++) {
                        for (int k = 0; k < C.length; k++) {
                            if (A[l] == B[j] && B[j] == C[k]) {
                                count++;
                            }
                        }
                    }
                }
                long endtime = System.nanoTime();
                total += endtime - starttime;
            }
            double averagetime = total / iteration;
            System.out.println("Number of common Triplets = " + count / iteration);
            csvWriter.append(N[i] + "," + averagetime + "\n");
            csvWriter.flush();
        }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}