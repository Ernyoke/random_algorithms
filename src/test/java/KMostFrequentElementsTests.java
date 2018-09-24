import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KMostFrequentElementsTests {
    @Test
    public void test() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 1, 6, 7, 6, 8, 3, 3);
        Assertions.assertThat(KMostFrequentElements.solve(integerList, 4)).containsExactlyInAnyOrder(3, 1, 6, 2);
    }
}
