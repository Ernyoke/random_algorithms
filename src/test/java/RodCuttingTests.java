import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RodCuttingTests {
    @Test
    public void length4() {
        int price[] = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int expected = 10;
        int actual = RodCutting.solve(price, 4);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void length5() {
        int price[] = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int expected = 13;
        int actual = RodCutting.solve(price, 5);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void length10() {
        int price[] = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int expected = 30;
        int actual = RodCutting.solve(price, 10);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void length19() {
        int price[] = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int expected = 55;
        int actual = RodCutting.solve(price, 19);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
