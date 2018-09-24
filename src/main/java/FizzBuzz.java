import java.util.stream.IntStream;

public class FizzBuzz {
    @FunctionalInterface
    private interface Printer {
        String run(String string);
    }

    @FunctionalInterface
    private interface FBFunction {
        Printer run(int n, String str, Printer printer);
    }

    private String getFizzOrBuzz(int n) {
        FBFunction fb = (int d, String str, Printer printer) -> {
            if (n % d == 0) {
                return (String f) -> str + printer.run("");
            } else {
                return printer;
            }
        };
        Printer identity = (String str) -> str;
        return fb.run(3, "Fizz", fb.run(5, "Buzz", identity)).run(String.valueOf(n));
    }

    public void solve(int n) {
        IntStream.iterate(1, i -> i + 1).limit(n).forEach(i -> System.out.println(getFizzOrBuzz(i)));
    }
}
