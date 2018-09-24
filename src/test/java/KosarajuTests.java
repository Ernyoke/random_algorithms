import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KosarajuTests {
    @Test
    public void test() {
        int g[][] = {
//               0  1  2  3  4  5  6  7
                {0, 0, 1, 0, 0, 0, 0, 0}, //A 0
                {1, 0, 0, 0, 0, 0, 0, 0}, //B 1
                {0, 1, 0, 1, 1, 0, 0, 0}, //C 2
                {0, 0, 0, 0, 0, 1, 0, 0}, //D 3
                {0, 0, 0, 0, 0, 1, 1, 0}, //E 4
                {0, 0, 0, 1, 0, 0, 0, 0}, //F 5
                {0, 0, 0, 0, 1, 0, 0, 1}, //G 6
                {0, 0, 0, 0, 0, 1, 1, 0}, //H 7
        };


        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 0, 1), Arrays.asList(7, 6, 4), Arrays.asList(5, 3));
        List<List<Integer>> actual = Kosaraju.kosaraju(g);
        for (int i = 0; i < actual.size(); i++) {
            List<Integer> actualComponent = actual.get(i);
            List<Integer> expectedComponent =  expected.get(i);
            Assertions.assertThat(expectedComponent).containsOnlyElementsOf(actualComponent);
        }
    }
}
