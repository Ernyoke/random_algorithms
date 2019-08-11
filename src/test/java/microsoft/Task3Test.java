package microsoft;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void test1() {
        int[] A = {2, 1, 3, 5, 4};
        assertEquals(new Task3().solution(A), 3);
    }

    @Test
    public void test2() {
        int[] A = {1, 2, 3, 4, 5};
        assertEquals(new Task3().solution(A), 5);
    }

    @Test
    public void test3() {
        int[] A = {1};
        assertEquals(new Task3().solution(A), 1);
    }

    @Test
    public void test4() {
        int[] A = {5, 4, 3, 2, 1};
        assertEquals(new Task3().solution(A), 1);
    }

    @Test
    public void test5() {
        int[] A = {4, 5, 1, 2, 3};
        assertEquals(new Task3().solution(A), 1);
    }

    @Test
    public void test6() {
        int[] A = new int[0];
        assertEquals(new Task3().solution(A), 0);
    }

    @Test
    public void test7() {
        assertEquals(new Task3().solution(null), 0);
    }
}
