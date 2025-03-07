import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacci.calculateFibonacci(0));
        assertEquals(1, fibonacci.calculateFibonacci(1));
        assertEquals(1, fibonacci.calculateFibonacci(2));
        assertEquals(2, fibonacci.calculateFibonacci(3));
        assertEquals(3, fibonacci.calculateFibonacci(4));
        assertEquals(5, fibonacci.calculateFibonacci(5));
    }
}
