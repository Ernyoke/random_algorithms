package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySortTest {

    @Test
    public void subarraySort() {
        int[] array = new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int[] actual = SubarraySort.subarraySort(array);
        Assertions.assertThat(actual[0]).isEqualTo(3);
        Assertions.assertThat(actual[1]).isEqualTo(9);
    }
}
