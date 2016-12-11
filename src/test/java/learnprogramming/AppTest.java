package learnprogramming;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testProbablePrime() {
        BigInteger BIG_INTEGER = BigInteger.probablePrime(10, new Random());
        System.out.println(BIG_INTEGER.doubleValue());

    }

    @Test
    public void shouldReturnPrimeNumber() {

        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(5));
    }

    @Test
    public void shouldNotReturnPrimeNumber() {

        assertFalse(App.isPrime(0));
        assertFalse(App.isPrime(1));
        assertFalse(App.isPrime(-11));
        assertFalse(App.isPrime(110));
    }
}

