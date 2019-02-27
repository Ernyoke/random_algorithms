import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzz {
    @FunctionalInterface
    private interface FBFunction {
        Function<String, String> run(int n, String str, Function<String, String> printer);
    }

    private String getFizzOrBuzz(int n) {
        FBFunction fb = (int d, String str, Function<String, String> printer) -> {
            if (n % d == 0) {
                return (String f) -> str + printer.apply("");
            } else {
                return printer;
            }
        };
        Function<String, String> identity = (String str) -> str;
        return fb.run(3, "Fizz", fb.run(5, "Buzz", identity)).apply(String.valueOf(n));
    }

    public void solve(int n) {
        IntStream.iterate(1, i -> i + 1).limit(n).forEach(i -> System.out.println(getFizzOrBuzz(i)));
    }
}
