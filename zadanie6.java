public class zadanie6 {
    static int maximum = 30;
    public static void main(String[] args) {
        Fibonacci(0,1);
    }
    public static void Fibonacci(Integer c1, Integer c2) {
        if(maximum >= 0) {
            System.out.println(c1);
            c1 = c1 + c2;
            maximum = maximum - 1;
            Fibonacci(c2, c1);
        }
    }
}