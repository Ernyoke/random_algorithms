package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeNumberSumTest {

    @Test
    public void threeNumberSum() {
        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        List<Integer[]> actual = ThreeNumberSum.threeNumberSum(array, 0);
        Assertions.assertThat(actual).containsExactly(new Integer[]{-8, 2, 6}, new Integer[]{-8, 3, 5},
                new Integer[]{-6, 1, 5});
    }
}
