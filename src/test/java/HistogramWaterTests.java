import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HistogramWaterTests {
    @Test
    public void test() {
        int[] histogram = {4, 0, 0, 6, 0, 0, 3, 8, 0, 2, 0, 5};
        int actual = HistogramWater.solve(histogram);
        Assertions.assertThat(actual).isEqualTo(36);
    }
}
