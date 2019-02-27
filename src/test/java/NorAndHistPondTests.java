import norandhistpond.Fish;
import norandhistpond.NoorAndHisPond;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NorAndHistPondTests {
    @Test
    public void test() {
        /*
        5 2
        9 4
        7 5
        10 6
        11 7
        13 8
         */
        List<Fish> fishList = Arrays.asList(new Fish(10, 6),
                new Fish(9, 4),
                new Fish(11, 7),
                new Fish(13, 8),
                new Fish(5, 2),
                new Fish(7, 5));
        int actual = NoorAndHisPond.solve(fishList);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    public void test2() {
        List<Fish> fishList = Arrays.asList(new Fish(4, 3),
                new Fish(5, 3),
                new Fish(6, 5),
                new Fish(7, 5),
                new Fish(8, 5),
                new Fish(8, 5));
        int actual = NoorAndHisPond.solve(fishList);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    public void test3() {
        List<Fish> fishList = Arrays.asList(new Fish(15, 3),
                new Fish(7, 6),
                new Fish(7, 6),
                new Fish(16, 15));
        int actual = NoorAndHisPond.solve(fishList);
        Assertions.assertThat(actual).isEqualTo(3);
    }
}
