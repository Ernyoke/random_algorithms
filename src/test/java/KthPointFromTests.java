import javafx.util.Pair;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KthPointFromTests {
    @Test
    public void test() {
        Pair<Double, Double> reference = new Pair<>(0.0, 0.0);
        List<Pair<Double, Double>> points = Arrays.asList(
                new Pair<>(1.0, 1.0),
                new Pair<>(2.0, 2.0),
                new Pair<>(3.0, 3.0),
                new Pair<>(1.0, 1.0),
                new Pair<>(4.0, 4.0)
        );
        Pair<Double, Double> actual = KthPointFrom.solve(points, reference, 1);
        Assertions.assertThat(actual).isEqualTo(new Pair<>(1.0, 1.0));
    }
}
