import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {
    @Test
    public void test1() {
        int[] heights = {1, 1, 4, 2, 1, 3};
        HeightChecker heightChecker = new HeightChecker();
        assertEquals(heightChecker.heightChecker(heights), 3);
    }

    @Test
    public void test2() {
        int[] heights = {1, 1, 4, 2, 1, 3, 12, 10};
        HeightChecker heightChecker = new HeightChecker();
        assertEquals(heightChecker.heightChecker(heights), 5);
    }
}
