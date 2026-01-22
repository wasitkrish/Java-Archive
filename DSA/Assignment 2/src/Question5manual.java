// This code is not in the question but was written out of curiosity for cases with manual pattern input

import java.util.Scanner;
public class Question5manual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n such that n is in range 1 to 100 : ");
        int n = sc.nextInt();
        sc.nextLine();
        char[][] ch = new char[n][n];
        System.out.println("Enter "+n+" Strings of length "+n+" :");
        for(int i=0;i<n;i++){
            String temp = sc.nextLine();
            if(temp.length()!=n){
                System.out.println("invalid length!! make sure string length is "+n+" characters");
                return;
            }
            ch[i]=temp.toCharArray();
        }
        System.out.print("Enter pattern to check for : ");
        String check = sc.nextLine();
        if(!(check.length()<=n)){
            System.out.println(" Invalid  ! make sure the length of pattern is less than or equal to "+n);
            return;
        }
        int len = check.length();
        char[] pattern = check.toCharArray();
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<=n-len;j++){
                boolean flag=true;
                for(int k=0; k<len;k++){
                    if(ch[i][j+k]!=pattern[k]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        for(int i=0;i<n-len;i++){
            for(int j=0;j<n;j++){
                boolean flag=true;
                for(int k=0;k<len;k++){
                    if(ch[i+k][j]!=pattern[k]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }

        }
        for(int i=0;i<n-len;i++){
            for(int j=0;j<n-len;j++){
                boolean flag=true;
                for(int k=0;k<len;k++){
                    if(ch[i+k][j+k]!=pattern[k]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        System.out.println("No of appearence is : "+count);
    }
}