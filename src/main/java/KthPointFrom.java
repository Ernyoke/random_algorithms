import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthPointFrom {

    public static Double distanceSqrd(Pair<Double, Double> a, Pair<Double, Double> b) {
        return Math.pow((a.getKey() - b.getKey()), 2) + Math.pow((a.getValue() - b.getValue()), 2);
    }

    public static Pair<Double, Double> solve(List<Pair<Double, Double>> points, Pair<Double, Double> reference, int k) {
        TreeMap<Double, ArrayList<Pair<Double, Double>>> distance = new TreeMap<>();
        points.stream().forEach(point -> {
            distance.compute(distanceSqrd(point, reference), (key, value) -> {
                if (value == null) {
                    return new ArrayList<>(Arrays.asList(point));
                }
                value.add(point);
                return value;
            });
        });
        List<Pair<Double, Double>> temp = distance.keySet().stream()
                .flatMap(key -> distance.get(key).stream().flatMap(Stream::of))
                .collect(Collectors.toList());
        if (temp.size() >= k) {
            return temp.get(k);
        }
        return null;
    }
}
