import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Sieve {
    private IntPredicate p = x -> true;

    public IntStream from(int n) {
        return IntStream.iterate(n, i -> i + 1);
    }

    public IntStream primes(IntStream s) {
        return s.filter(i -> p.test(i)).peek(i -> p = p.and(v -> v % i != 0));
    }
}
