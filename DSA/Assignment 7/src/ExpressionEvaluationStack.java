import java.util.Scanner;
public class ExpressionEvaluationStack {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix Expression: ");
        String exp = sc.nextLine();

        String[] tokens = exp.trim().split("\\s+");
        int[] stack = new int[tokens.length];
        int top =-1;
        for(String token : tokens){
            // IF A NUMBER -> PUSH
            if(Character.isDigit(token.charAt(0))){
                stack[++top]=Integer.parseInt(token);
            }
            //operator
            else{
                int b= stack[top--];
                int a= stack[top--];
                int result=0;
                switch(token.charAt(0)){
                    case '+': result=a+b; break;
                    case '-': result=a-b; break;
                    case '*': result=a*b; break;
                    case '/': result=a/b; break;
                    case '^': result=(int)Math.pow(a,b);break;
                }
                stack[++top]=result;
            }
        }
        System.out.println("Result : "+stack[top]);
    }
}