import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SHKNUMTests {
    @Test
    public void test() {
        int n = 15;
        int actual = SHKNUM.solve(n);
        int actualBinary = SHKNUM.solveBinarySeach(n);
        Assertions.assertThat(actual).isEqualTo(2);
        Assertions.assertThat(actualBinary).isEqualTo(2);
    }

    @Test
    public void test2() {
        int n = 102;
        int actual = SHKNUM.solve(n);
        int actualBinary = SHKNUM.solveBinarySeach(n);
        Assertions.assertThat(actual).isEqualTo(6);
        Assertions.assertThat(actualBinary).isEqualTo(6);
    }
}
