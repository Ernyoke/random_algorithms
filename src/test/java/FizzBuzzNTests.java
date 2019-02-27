import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzNTests {
    @Test
    public void test() {
        FizzBuzzN fizzBuzzN = new FizzBuzzN();
        Map<Integer, String> buzzers = new HashMap<>();
        buzzers.put(3, "Fizz");
        buzzers.put(5, "Buzz");
        buzzers.put(7, "Foo");
        buzzers.put(9, "Bar");
        fizzBuzzN.solve(25, buzzers);
    }
}
