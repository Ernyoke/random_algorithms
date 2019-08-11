package microsoft;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void test1() {
        int N = 213;
        assertEquals(new Task2().solution(N), 321);
    }

    @Test
    public void test2() {
        int N = 535;
        assertEquals(new Task2().solution(N), 553);
    }

    @Test
    public void test3() {
        int N = 10;
        assertEquals(new Task2().solution(N), 10);
    }

    @Test
    public void test4() {
        int N = 100000000;
        assertEquals(new Task2().solution(N), -1);
    }

    @Test
    public void test6() {
        int N = 0;
        assertEquals(new Task2().solution(N), 0);
    }

    @Test
    public void test7() {
        int N = 124593;
        assertEquals(new Task2().solution(N), 954321);
    }

    @Test
    public void test8() {
        int N = 21222;
        assertEquals(new Task2().solution(N), 22221);
    }

    @Test
    public void test9() {
        int N = 2147483647;
        assertEquals(new Task2().solution(N), -1);
    }

    @Test
    public void test10() {
        int N = -1;
        assertEquals(new Task2().solution(N), -1);
    }
}
