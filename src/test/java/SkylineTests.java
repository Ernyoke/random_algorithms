import org.assertj.core.api.Assertions;
import org.junit.Test;
import skyline.Building;
import skyline.Point;
import skyline.Skyline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkylineTests {
    @Test
    public void test() {
        List<Building> buildings = Arrays.asList(new Building(1, 3, 2),
                new Building(3, 6, 5),
                new Building(4, 8, 3),
                new Building(7, 9, 7),
                new Building(9, 11, 1));
        List<Point> expected = Arrays.asList(new Point(1, 2),
                new Point(3, 5),
                new Point(6, 5),
                new Point(6, 3),
                new Point(7, 3),
                new Point(7, 7),
                new Point(10, 1),
                new Point(11, 1));
        List<Point> actual = Skyline.solve(new ArrayList<>(buildings));
        Assertions.assertThat(actual).containsOnlyElementsOf(expected);
        actual.stream().forEach(System.out::println);
    }
}