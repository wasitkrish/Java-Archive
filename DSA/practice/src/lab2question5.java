import java.util.Scanner;

public class lab2question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        int count = 0;

        // Horizontal (left to right)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (grid[i][j] == 's' &&
                        grid[i][j + 1] == 'a' &&
                        grid[i][j + 2] == 'b' &&
                        grid[i][j + 3] == 'a') {
                    count++;
                }
            }
        }

        // Vertical (top to bottom)
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 's' &&
                        grid[i + 1][j] == 'a' &&
                        grid[i + 2][j] == 'b' &&
                        grid[i + 3][j] == 'a') {
                    count++;
                }
            }
        }

        // Diagonal (top-left to bottom-right)
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (grid[i][j] == 's' &&
                        grid[i + 1][j + 1] == 'a' &&
                        grid[i + 2][j + 2] == 'b' &&
                        grid[i + 3][j + 3] == 'a') {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
