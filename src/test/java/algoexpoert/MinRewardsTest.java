package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinRewardsTest {

    @Test
    public void minRewards() {
        int[] scores = new int[]{8, 4, 2, 1, 3, 6, 7, 9, 5};
        int actual = MinRewards.minRewards(scores);
        Assertions.assertThat(actual).isEqualTo(25);
    }
}
