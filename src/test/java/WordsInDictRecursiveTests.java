import org.assertj.core.api.Assertions;
import org.junit.Test;

public class WordsInDictRecursiveTests {
    @Test
    public void test() {
        String word = "peenutbutter";
        WordsInDictRecursive w = new WordsInDictRecursive();
        boolean actual = w.solve(word);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    public void negativeTest() {
        String word = "peenutbuter";
        WordsInDictRecursive w = new WordsInDictRecursive();
        boolean actual = w.solve(word);
        Assertions.assertThat(actual).isFalse();
    }
}
