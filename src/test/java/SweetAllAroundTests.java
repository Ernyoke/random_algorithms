import javafx.util.Pair;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SweetAllAroundTests {
    @Test
    public void test() {
        List<Pair<Integer, Integer>> students = Arrays.asList(
                new Pair<>(3, 6),
                new Pair<>(1, 6),
                new Pair<>(7, 11),
                new Pair<>(2, 15),
                new Pair<>(5, 8)
        );
        Pair<Integer, Integer> actual = SweetAllAround.solve(students);
        Assertions.assertThat(actual.getKey()).isEqualTo(5);
        Assertions.assertThat(actual.getValue()).isEqualTo(4);
    }
}
