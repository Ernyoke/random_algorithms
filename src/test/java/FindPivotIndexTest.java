import org.junit.Test;

import static org.junit.Assert.*;

public class FindPivotIndexTest {

    @Test
    public void pivotIndex() {
        int[] nums = {1,7,3,6,5,6};
        assertEquals(new FindPivotIndex().pivotIndex(nums), 3);
    }

    @Test
    public void pivotIndex2() {
        int[] nums = {-1,-1,-1,-1,-1,0};
        assertEquals(new FindPivotIndex().pivotIndex(nums), 2);
    }
}
