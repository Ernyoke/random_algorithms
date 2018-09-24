import org.jetbrains.annotations.Contract;

import java.util.*;

public class KMostFrequentElements {

    @Contract(pure = true)
    public static List<Integer> solve(List<Integer> elements, int k) {
        HashMap<Integer, Integer> histogram = new HashMap<>();
        elements.forEach(element -> {
            if (histogram.containsKey(element)) {
                histogram.put(element, histogram.get(element) + 1);
            } else {
                histogram.put(element, 1);
            }
        });
        List<Integer> firstK = new ArrayList<>(histogram.keySet());
        Collections.sort(firstK, (a, b) -> {
            Integer aValue = histogram.get(a);
            Integer bValue = histogram.get(b);
            int comp = aValue.compareTo(bValue);
            if (comp == 0) {
                return a.compareTo(b);
            }
            return comp * -1;
        });
        return firstK.subList(0, k);
    }
}
