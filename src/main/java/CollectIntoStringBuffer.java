import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectIntoStringBuffer {
    public static String solve(int n) {
        return IntStream.iterate(n, i -> i - 1).limit(n).boxed().map(Object::toString).collect(Collectors.joining());
    }
}
