import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CCirclesTests {
    @Test
    public void test() {
        List<CCircles.Circle> circles = Arrays.asList(
                new CCircles.Circle(new CCircles.Point(0, 0), 5),
                new CCircles.Circle(new CCircles.Point(8, 3), 2));
        List<Integer> queries = Arrays.asList(0, 10, 20);
        List<Integer> actualResult = CCircles.solve(circles, queries);
        Assertions.assertThat(actualResult).containsExactlyInAnyOrder(0, 1, 0);
    }
}
