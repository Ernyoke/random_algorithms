// https://leetcode.com/contest/weekly-contest-138/problems/height-checker/

import java.util.PriorityQueue;
import java.util.Queue;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        Queue<Integer> sortedHeights = new PriorityQueue<>();
        for (int height : heights) {
            sortedHeights.offer(height);
        }
        int result = 0;
        for (int height: heights) {
            if (!sortedHeights.remove().equals(height)) {
                result++;
            }
        }
        return result;
    }
}
