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
}
