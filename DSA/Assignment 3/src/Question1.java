import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Arrays;
public class Question1 {
    public static void main(String[] binary) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] N = {5, 10, 20, 50, 100, 200, 500};
        System.out.print("Enter a number to search for N :");
        int search = sc.nextInt();
        try (FileWriter csvWriter = new FileWriter("/home/krish/Desktop/Java-Archive/DSA/Assignment 3/plots/Question12.csv")) {
            csvWriter.append("N,ExecutionTimeNs\n");
            for (int i = 0; i < N.length; i++) {
                int[] arr = new int[N[i]];
                for (int j = 0; j < N[i]; j++) {
                    arr[j] = rand.nextInt(N[i]);
                }
                Arrays.sort(arr);
                boolean check = false;
                long total = 0;
                int iteration = 500;
                int index = 0;
                for (int itr = 0; itr < iteration; itr++) {
                    int low = 0;
                    int high = arr.length - 1;
                    long startime = System.nanoTime();
                    while (low <= high) {
                        int mid = low + (high - low) / 2;
                        if (search == arr[mid]) {
                            check = true;
                            index = mid;
                            break;
                        }
                        if (arr[mid] < search)
                            low = mid + 1;
                        if (arr[mid] > search)
                            high = mid - 1;
                    }
                    long endtime = System.nanoTime();
                    total += (endtime - startime);
                }
                double averagetime = (total / (double) iteration);
                csvWriter.append(N[i]+","+averagetime+"\n");
                if (check)
                    System.out.println("Element found at index: " + index);
                if (!check)
                    System.out.println("Element not found");
                System.out.println("Time taken for execution is : " + averagetime + " ns ");
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        sc.close();
        System.out.println("Performance data saved to plots/Question1.csv");
    }
}