class Task implements Runnable {
    int num, denom;
    Task(int n, int d) {
        num = n;
        denom = d;
    }
    public void run() {
        int result = num / denom;
        System.out.println("Result: " + result);
    }
}
public void run() {
    try {
        int result = num / denom;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Exception handled in thread");
    }
}