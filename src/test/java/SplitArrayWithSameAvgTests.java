import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SplitArrayWithSameAvgTests {
    @Test
    public void test() {
        List<Integer> list = Arrays.asList(2, 4, 5, 7, 10, 14);
        boolean actual = SplitArrayWithSameAvg.solve(list);
        Assertions.assertThat(actual).isTrue();
    }
}
