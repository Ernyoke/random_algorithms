import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void isValid1() {
        String input = "()[]{}";
        assertTrue(new ValidParentheses().isValid(input));
    }

    @Test
    public void isNotValid() {
        String input = "([)]";
        assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isNotValid1() {
        String input = "]";
        assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isNotValid2() {
        String input = ")(";
        assertFalse(new ValidParentheses().isValid(input));
    }

    @Test
    public void isNotValid3() {
        String input = "(((((()))";
        assertFalse(new ValidParentheses().isValid(input));
    }
}
