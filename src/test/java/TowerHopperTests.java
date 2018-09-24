import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TowerHopperTests {
    @Test
    public void firstTest() {
        int towers[] = {4, 2, 0, 0, 2, 0};
        Assertions.assertThat(TowerHopper.solve(towers)).isTrue();
    }
}
