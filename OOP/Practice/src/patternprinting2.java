import java.util.Scanner;
class numpattern{
    public int[][] createarr(int n){
        int[][] numb = new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                numb[i][j]=++count;
            }
            count=0;
        }
        return numb;
    }
    public void display(int[][] num,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class patternprinting2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        numpattern obj = new numpattern();
        System.out.print("Enter length of pattern: ");
        int n = sc.nextInt();
        int[][] temp = obj.createarr(n);
        obj.display(temp,n);
    }
}