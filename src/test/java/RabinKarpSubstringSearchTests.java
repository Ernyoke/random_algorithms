import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RabinKarpSubstringSearchTests {
    @Test
    public void substringExists() {
        String str = "substringexists";
        String toSearch = "string";
        int expected = 3;
        int actual = RabinKarpSubstring.solve(str, toSearch);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void substringExists2() {
        String str = "substringexists";
        String toSearch = "exists";
        int expected = 9;
        int actual = RabinKarpSubstring.solve(str, toSearch);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subStringNotexists() {
        String str = "substringexists";
        String toSearch = "not";
        int expected = -1;
        int actual = RabinKarpSubstring.solve(str, toSearch);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
