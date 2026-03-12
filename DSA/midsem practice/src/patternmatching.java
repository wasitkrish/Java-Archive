import java.util.Scanner;
public class patternmatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int N = sc.nextInt();
        sc.nextLine();
        char[][] name = new char[N][N];
        System.out.println("Enter a N*N matrix with N names of length N: ");
        for(int i=0;i<N;i++){
            String mediate = sc.nextLine();
            if(mediate.length()!=N){
                System.out.print("Invalid length of string make sure its less than N");
                return;
            }
            else{
                name[i]=mediate.toCharArray();
            }
        }
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<=N-4;j++){
                if(name[i][j]=='s' && name[i][j+1]=='a' && name[i][j+2]=='b' && name[i][j+3]=='a'){
                    count++;
                }
            }
        }
        for(int i=0;i<=N-4;i++){
            for(int j=0;j<N;j++){
                if(name[i][j]=='s' && name[i+1][j]=='a' && name[i+2][j]=='b' && name[i+3][j]=='a'){
                    count++;
                }
            }
        }
        for(int i=0;i<=N-4;i++){
            for(int j=0;j<=N-4;j++){
                if(name[i][j]=='s' && name[i+1][j+1]=='a' && name[i+2][j+2]=='b' && name[i+3][j+3]=='a'){
                    count++;
                }
            }
        }
        for(int i=0;i<=N-4;i++){
            for(int j=3;j<N;j++){
                if(name[i][j]=='s' && name[i+1][j-1]=='a' && name[i+2][j-2]=='b' && name[i+3][j-3]=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}