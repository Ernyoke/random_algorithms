import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class VallhallaSiegeTests {
    @Test
    public void test() {
        List<Integer> strenghts = Arrays.asList(10, 2, 1, 2, 1);
        List<Integer> arrows = Arrays.asList(3, 10, 1, 1, 1);
        List<Integer> actual = VallhallaSiege.solve(strenghts, arrows);
        System.out.println(actual);
    }
}
