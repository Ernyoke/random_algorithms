import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedArrayTest {
    @Test
    public void rotated() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void rotated2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expected = -1;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void rotated3() {
        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;
        int expected = 4;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void rotated4() {
        int[] nums = {3, 5, 1};
        int target = 3;
        int expected = 0;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void notRotated() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int target = 1;
        int expected = 1;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void notRotated2() {
        int[] nums = {1, 3};
        int target = 3;
        int expected = 1;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }

    @Test
    public void notFound() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int target = 15;
        int expected = -1;
        assertEquals(new SearchInRotatedArray().search(nums, target), expected);
    }
}
