import org.junit.Assert;
import org.junit.Test;

public class ChdigitTest {

    @Test
    public void solve() {
        int n = 121134359;
        int d = 6;
        int expected = 111335666;
        int actual = new Chdigit().solve(n, d);
        Assert.assertEquals(actual, expected);
    }
}
