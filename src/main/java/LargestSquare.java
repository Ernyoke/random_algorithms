/*
    https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/largest-square-3d7a938a/description/
 */

import javafx.util.Pair;

import java.util.*;

public class LargestSquare {
    public static Pair<Integer, Integer> solve(List<Pair<Integer, Integer>> points) {
        TreeMap<Integer, List<Integer>> mapByX = new TreeMap<>();
        points.forEach(point -> mapByX.compute(point.getKey(), (key, value) -> {
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(point.getValue());
            return value;
        }));
        int maxSide = 0;
        Pair<Integer, Integer> bottomLeft = null;
        for (Map.Entry<Integer, List<Integer>> entry : mapByX.entrySet()) {
            int x1 = entry.getKey();
            List<Integer> ySet = entry.getValue();
            for (int i = 0; i < ySet.size() - 1; i++) {
                for (int j = i + 1; j < ySet.size(); j++) {
                    int y1 = ySet.get(i);
                    int y2 = ySet.get(j);
                    int side = Math.abs(y1 - y2);
                    if (side > maxSide) {
                        if (mapByX.get(x1 + side) != null &&
                                mapByX.get(x1 + side).contains(y1) && mapByX.get(x1 + side).contains(y2)) {
                            maxSide = side;
                            bottomLeft = new Pair<>(x1, y1);
                        }
                    }
                }
            }
        }
        return bottomLeft;
    }
}
