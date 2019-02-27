import javafx.util.Pair;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class LargestSquareTests {
    @Test
    public void test() {
        Pair<Integer, Integer> actual = LargestSquare.solve(Arrays.asList(
                new Pair<>(1, 1),
                new Pair<>(3, 1),
                new Pair<>(5, 1),
                new Pair<>(1, 3),
                new Pair<>(3, 3),
                new Pair<>(5, 3)
        ));
        Assertions.assertThat(actual.getKey()).isEqualTo(1);
        Assertions.assertThat(actual.getValue()).isEqualTo(1);
    }
}
