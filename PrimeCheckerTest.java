import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testNegativeNumber() {
        assertFalse(PrimeChecker.isPrime(-5));
    }

    @Test
    public void testZero() {
        assertFalse(PrimeChecker.isPrime(0));
    }

    @Test
    public void testOne() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    public void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    public void testNonPrime() {
        assertFalse(PrimeChecker.isPrime(10));
    }

    @Test
    public void testTwo() {
        assertTrue(PrimeChecker.isPrime(2)); // kiểm tra trường hợp nhỏ nhất prime
    }

    @Test
    public void testDivisibleCase() {
        assertFalse(PrimeChecker.isPrime(9)); // chia hết cho 3
    }
}
