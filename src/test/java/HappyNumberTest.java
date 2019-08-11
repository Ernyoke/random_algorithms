import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void test1() {
        assertTrue(new HappyNumber().isHappy(19));
    }

    @Test
    public void test2() {
        assertFalse(new HappyNumber().isHappy(2));
    }
}
