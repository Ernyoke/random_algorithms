import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringRecoursiveTest {

    @Test
    public void reverse1() {
        assertEquals(new ReverseStringRecoursive().reverse("asd"), "dsa");
    }

    @Test
    public void reverse2() {
        assertEquals(new ReverseStringRecoursive().reverse("qweasdzxc"), "cxzdsaewq");
    }

    @Test
    public void reverse3() {
        assertEquals(new ReverseStringRecoursive().reverse(""), "");
    }

    @Test
    public void reverse4() {
        assertEquals(new ReverseStringRecoursive().reverse(null), "");
    }

    @Test
    public void reverse21() {
        assertEquals(new ReverseStringRecoursive().reverse2("asd"), "dsa");
    }

    @Test
    public void reverse22() {
        assertEquals(new ReverseStringRecoursive().reverse2("qweasdzxc"), "cxzdsaewq");
    }

    @Test
    public void reverse23() {
        assertEquals(new ReverseStringRecoursive().reverse2(""), "");
    }

    @Test
    public void reverse24() {
        assertEquals(new ReverseStringRecoursive().reverse2(null), "");
    }
}
