package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoNumberSumTest {

    @Test
    public void twoNumberSum() {
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        int[] actual = TwoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertThat(actual[0]).isEqualTo(-1);
        Assertions.assertThat(actual[1]).isEqualTo(11);
    }
}
