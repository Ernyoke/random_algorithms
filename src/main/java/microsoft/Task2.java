package microsoft;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task2 {
    static final int X = 100000000;

    public int solution(int N) {
        if (N < 0 || N >= X) {
            return -1;
        }
        Queue<Integer> digits = digitsOrdered(N);
        return getLargestNumber(digits);
    }

    private Queue<Integer> digitsOrdered(int n) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        while (n > 0) {
            queue.offer(n % 10);
            n /= 10;
        }
        return queue;
    }

    private int getLargestNumber(Queue<Integer> queue) {
        int n = 0;
        while (!queue.isEmpty()) {
            n = n * 10 + queue.poll();
        }
        return n;
    }
}
