class BasicException{
    public static void main(String[] args){
        int a=10, b=0;
        try{
            int result = a/b;
            System.out.println("result");
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by 0");
        }
    }
}