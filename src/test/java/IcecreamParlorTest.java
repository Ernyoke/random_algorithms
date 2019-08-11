import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IcecreamParlorTest {

    @Test
    public void test1() {
        List<IcecreamParlor.IceCream> iceCreams = Arrays.asList(
                new IcecreamParlor.IceCream("strawberry", 2),
                new IcecreamParlor.IceCream("blueberry", 7),
                new IcecreamParlor.IceCream("nutella", 13),
                new IcecreamParlor.IceCream("vanilla", 5),
                new IcecreamParlor.IceCream("banana", 4),
                new IcecreamParlor.IceCream("gum", 12),
                new IcecreamParlor.IceCream("chocolate", 5)
                );
        List<List<IcecreamParlor.IceCream>> actual = IcecreamParlor.solve(iceCreams, 10);
        System.out.println(actual);
    }

    @Test
    public void test2() {
        List<IcecreamParlor.IceCream> iceCreams = Arrays.asList(
                new IcecreamParlor.IceCream("strawberry", 2),
                new IcecreamParlor.IceCream("blueberry", 7),
                new IcecreamParlor.IceCream("nutella", 13),
                new IcecreamParlor.IceCream("vanilla", 5),
                new IcecreamParlor.IceCream("banana", 4),
                new IcecreamParlor.IceCream("gum", 12),
                new IcecreamParlor.IceCream("chocolate", 5)
        );
        List<List<IcecreamParlor.IceCream>> actual = IcecreamParlor.solve(iceCreams, 9);
        System.out.println(actual);
    }
}
