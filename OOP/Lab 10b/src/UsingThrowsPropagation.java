class UsingThrowsPropagation{
    static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){

            int result = divide(10,0);
            System.out.println(result);

            System.out.println(("Handled in main"));

    }
}