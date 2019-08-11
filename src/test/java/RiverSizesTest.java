import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RiverSizesTest {

    @Test
    public void riverSizes() {
        int[][] matrix = {{1, 0, 0, 1, 0}, {1, 0, 1, 0, 0}, {0, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 0}};
//        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 5));
        ArrayList<Integer> actual = RiverSizes.riverSizes(matrix);
        System.out.println(actual);
    }
}
