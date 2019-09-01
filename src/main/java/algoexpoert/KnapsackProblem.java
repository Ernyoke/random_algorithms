package algoexpoert;

import java.util.ArrayList;
import java.util.Collections;

public class KnapsackProblem {
    public static ArrayList<ArrayList<Integer>> knapsackProblem(int[][] items, int capacity) {
        int[][] d = new int[items.length + 1][capacity + 1];
        for (int i = 1; i <= items.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                int index = i - 1;
                if (j - items[index][1] >= 0) {
                    d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - items[index][1]] + items[index][0]);
                } else {
                    d[i][j] = d[i - 1][j];
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Collections.singletonList(d[items.length][capacity])));
        ArrayList<Integer> it = new ArrayList<>();
        int j = capacity;
        for (int i = items.length; i > 0; i--) {
            if (d[i][j] != d[i - 1][j]) {
                it.add(i - 1);
                j = j - items[i - 1][1];
            }
        }
        Collections.reverse(it);
        result.add(it);
        return result;
    }
}
