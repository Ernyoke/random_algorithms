import org.junit.Test;

public class SieveTest {

    @Test
    public void primes() {
        Sieve sieve = new Sieve();
        sieve.primes(sieve.from(2)).limit(100).forEach(System.out::println);
    }
}
