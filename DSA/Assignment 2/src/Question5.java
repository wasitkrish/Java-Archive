import java.util.Scanner;
public class Question5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n in between 1 and 100 : ");
        int n = sc.nextInt();
        sc.nextLine();
        char[][] ch = new char[n][n];
        System.out.println("Enter "+n+" strings of "+n+" length : ");
        for(int i=0;i<n;i++){
            String temp = sc.nextLine();
            if(temp.length()!=n){
                System.out.println("Invalid Input !! Enter string of "+n+" no of characters only                                                                               ");
                return;
            }
            ch[i]=temp.toCharArray();
        }
        String check= "saba";
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-4;j++){
                if(ch[i][j]=='s' && ch[i][j+1]=='a' && ch[i][j+2]=='b' && ch[i][j+3]=='a'){
                    count++;
                }
            }
        }
        for(int i=0;i<=n-4;i++){
            for(int j=0;j<n;j++){
                if(ch[i][j]=='s' && ch[i+1][j]=='a' && ch[i+2][j]=='b' && ch[i+3][j]=='a'){
                    count++;
                }
            }
        }
        for(int i=0;i<=n-4;i++){
            for(int j=0;j<=n-4;j++) {
                if (ch[i][j] == 's' && ch[i + 1][j + 1] == 'a' && ch[i + 2][j + 2] == 'b' && ch[i + 3][j + 3] == 'a') {
                    count++;
                }
            }

        }
        System.out.print("Word observerd "+count+" times");

    }
}