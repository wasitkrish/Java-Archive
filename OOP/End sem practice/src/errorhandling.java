public class errorhandling {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age less than 18 : not eligible");
        }
        else{
            System.out.println("Eligible age");
        }

    }
    static int divide(int a,int b) throws ArithmeticException{
        return(a/b);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds : fix indexing");
        }
        finally{
            try{
                divide(10,0);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception: cannot divide by zero");
            }
            checkAge(10);
        }
        System.out.println("All ok");


    }
}