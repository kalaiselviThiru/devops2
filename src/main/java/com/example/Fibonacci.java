public class Fibonacci {
    public int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10; // Change this value to get the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci.calculateFibonacci(n));
    }
}
