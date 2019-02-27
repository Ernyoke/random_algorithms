import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FloodFillTests {
    @Test
    public void testFalse() {
        int[][] area = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 0},
        };
        boolean actual = FloodFill.solve(area, 0, 3);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    public void testTrue() {
        int[][] area = {
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 0},
        };
        boolean actual = FloodFill.solve(area, 0, 3);
        Assertions.assertThat(actual).isTrue();
    }
}
