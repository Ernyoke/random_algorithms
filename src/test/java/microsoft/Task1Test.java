package microsoft;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void test1() {
        int[] A = {1, 4, -1, 3, 2};
        assertEquals(new Task1().solution(A), 4);
    }

    @Test
    public void test2() {
        int[] A = {1, 2, 3, 5, 4, -1};
        assertEquals(new Task1().solution(A), 5);
    }


    @Test
    public void test3() {
        int[] A = {-1};
        assertEquals(new Task1().solution(A), 1);
    }

    @Test
    public void test4() {
        int[] A = new int[0];
        assertEquals(new Task1().solution(A), 0);
    }

    @Test
    public void test5() {
        assertEquals(new Task1().solution(null), 0);
    }
}
