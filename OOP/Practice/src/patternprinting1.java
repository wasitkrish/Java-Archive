import java.util.Scanner;
class pattern{
    public char[][] createpattern(int n){
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]='*';
            }
        }
        return arr;
    }
    public void display(char[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class patternprinting1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        pattern obj = new pattern();
        System.out.print("Enter pattern length: ");
        int n = sc.nextInt();
        char[][] array = obj.createpattern(n);
        obj.display(array,n);
    }
}
