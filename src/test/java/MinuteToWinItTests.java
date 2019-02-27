import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinuteToWinItTests {
    @Test
    public void test() {
        List<Integer> values = Arrays.asList(1, 2, 5, 7, 9, 85);
        int actual = MinuteToWinIt.solve(values, 2);
        Assertions.assertThat(actual).isEqualTo(2);
    }
}
