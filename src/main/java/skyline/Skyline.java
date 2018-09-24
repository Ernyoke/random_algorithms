package skyline;

import org.jetbrains.annotations.Contract;

import java.util.*;
import java.util.stream.Collectors;

public class Skyline {
    @Contract(pure = true)
    public static List<Point> solve(ArrayList<Building> buildings) {
        List<BuildingPoint> buildingPoints = buildings.stream().
                map(building -> Arrays.asList(
                        new BuildingPoint(building.getStart(), building.getHeight(), BuildingPoint.Type.S),
                        new BuildingPoint(building.getEnd(), building.getHeight(), BuildingPoint.Type.F)))
                .flatMap(Collection::stream)
                .sorted((a, b) -> {
                    if (a.getX() != b.getX()) {
                        return a.getX() - b.getX();
                    } else {
                        return (a.getType() == BuildingPoint.Type.S ? -a.getY() : a.getY()) - (b.getType() == BuildingPoint.Type.S ? -b.getY() : b.getY());
                    }
                })
                .collect(Collectors.toList());
        ArrayList<Point> points = new ArrayList<>();
        TreeMap<Integer, Integer> maxVals = new TreeMap<>();
        maxVals.put(0, 1);
        int prevMaxHeight = 0;
        for (BuildingPoint buildingPoint : buildingPoints) {
            switch (buildingPoint.getType()) {
                case S:
                    maxVals.compute(buildingPoint.getY(), (key, value) -> {
                        if (value != null) {
                            return value + 1;
                        }
                        return 1;
                    });
                    break;
                case F:
                    maxVals.compute(buildingPoint.getY(), (key, value) -> {
                        if (value == 1) {
                            return null;
                        }
                        return value - 1;
                    });
                    break;
            }
            int currentMaxHeight = maxVals.lastKey();
            if (currentMaxHeight != prevMaxHeight) {
                points.add(new Point(buildingPoint.getX(), currentMaxHeight));
                prevMaxHeight = currentMaxHeight;
            }
        }
        return points;
    }
}
