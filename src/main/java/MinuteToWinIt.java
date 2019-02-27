/*
    https://www.hackerrank.com/contests/w38/challenges/minute-to-win-it/problem
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinuteToWinIt {
    private static int findMax(Map<Integer, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }

    public static int solve(List<Integer> values, int difference) {
        Map<Integer, Integer> deltas = new HashMap<>();
        int currentPosition = 0;
        for (Integer value: values) {
            int currentDifference = Math.abs(currentPosition - value);
            deltas.compute(currentDifference, (key, v) -> {
                if (v == null) {
                    v = 1;
                } else {
                    v++;
                }
                return v;
            });
            currentPosition += difference;
        }
        return values.size() - findMax(deltas);
    }
}
