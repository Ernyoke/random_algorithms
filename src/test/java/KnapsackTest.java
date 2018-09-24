import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KnapsackTest {
    @Test
    public void testKnap() {
        int n = 5;
        int weight[] = {2, 4, 3, 1, 5};
        int value[] = {5, 2, 6, 5, 7};
        int kWeight = 9;
        int expected = 18;
        int actual = Knapsack.solveMax(weight, value, n, kWeight);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
