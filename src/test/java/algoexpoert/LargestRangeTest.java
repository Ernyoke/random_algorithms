package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestRangeTest {

    @Test
    public void largestRange() {
        int[] array = new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int[] expected = new int[]{0, 7};
        int[] actual = LargestRange.largestRange(array);
        Assertions.assertThat(actual).containsExactly(expected);
    }
}
