class UsingThrow{
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args){
        checkAge(16);
    }
}