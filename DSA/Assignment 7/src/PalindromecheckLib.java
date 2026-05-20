import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Stack;

public class PalindromecheckLib {

    public static boolean checkpalindrome(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        for(int i=0; i < str.length();i++){
            if(str.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine().toLowerCase().replaceAll("\\s+","");
        if(checkpalindrome(s)){
            System.out.println("The given String is Palindrome");
        }
        else {
            System.out.println("The given String is not Palindrome");
        }
        sc.close();
    }
}


