import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CollectIntoStringBufferTests {
    @Test
    public void test() {
        String actual = CollectIntoStringBuffer.solve(5);
        Assertions.assertThat(actual).isEqualTo("54321");
    }
}
