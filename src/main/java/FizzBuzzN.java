import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzzN {
    @FunctionalInterface
    private interface FBFunction {
        Function<String, String> run(int n, String str, Function<String, String> printer);
    }

    private String getFizzOrBuzz(int n, Map<Integer, String> buzzers) {
        FBFunction fb = (int d, String str, Function<String, String> printer) -> {
            if (n % d == 0) {
                return (String f) -> str + printer.apply("");
            } else {
                return printer;
            }
        };
        Function<String, String> identity = (String str) -> str;

        List<Integer> keys = new ArrayList<>(buzzers.keySet());
        if (keys.size() > 0) {
            Integer firstKey = keys.get(keys.size() - 1);
            Function<String, String> func = fb.run(firstKey, buzzers.get(firstKey), identity);
            for (int i = keys.size() - 2; i >= 0; i--) {
                func = fb.run(keys.get(i), buzzers.get(keys.get(i)), func);
            }
            return func.apply(String.valueOf(n));
        }
        return null;
    }

    public void solve(int n, Map<Integer, String> buzzers) {
        IntStream.iterate(1, i -> i + 1).limit(n).forEach(i -> System.out.println(getFizzOrBuzz(i, buzzers)));
    }
}
