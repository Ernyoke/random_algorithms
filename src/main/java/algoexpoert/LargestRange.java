package algoexpoert;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static int[] largestRange(int[] array) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], false);
        }
        int startPos = 0;
        int lastPost = 0;
        int maxRange = 0;
        for (int i = 0; i < array.length; i++) {
            int range = 0;
            int current = array[i];
            if (!map.get(current)) {
                do {
                    map.put(current, true);
                    range++;
                    current--;
                } while (map.get(current) != null && !map.get(current));
                int startValue = current + 1;
                current = array[i];
                do {
                    map.put(current, true);
                    range++;
                    current++;
                } while (map.get(current) != null && !map.get(current));
                if (range > maxRange) {
                    startPos = startValue;
                    lastPost = current - 1;
                    maxRange = range;
                }
            }
        }
        return new int[] {startPos, lastPost};
    }
}
