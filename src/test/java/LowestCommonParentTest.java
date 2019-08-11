import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class LowestCommonParentTest {
//         A
//       /   \
//      B     C
//    /   \    \
//   D     E    F
//  / \   / \   / \
// G   H I   J  K  L

    private LowestCommonParent.Node g = new LowestCommonParent.Node("G", Collections.emptyList());
    private LowestCommonParent.Node h = new LowestCommonParent.Node("H", Collections.emptyList());
    private LowestCommonParent.Node i = new LowestCommonParent.Node("I", Collections.emptyList());
    private LowestCommonParent.Node j = new LowestCommonParent.Node("J", Collections.emptyList());
    private LowestCommonParent.Node k = new LowestCommonParent.Node("K", Collections.emptyList());
    private LowestCommonParent.Node l = new LowestCommonParent.Node("L", Collections.emptyList());

    private LowestCommonParent.Node d = new LowestCommonParent.Node("D", Arrays.asList(g, h));
    private LowestCommonParent.Node e = new LowestCommonParent.Node("E", Arrays.asList(i, j));
    private LowestCommonParent.Node f = new LowestCommonParent.Node("F", Arrays.asList(k, l));

    private LowestCommonParent.Node b = new LowestCommonParent.Node("B", Arrays.asList(d, e));
    private LowestCommonParent.Node c = new LowestCommonParent.Node("C", Collections.singletonList(f));

    private LowestCommonParent.Node a = new LowestCommonParent.Node("A", Arrays.asList(b, c));

    @Test
    public void testLowestCommonParent1() {
        LowestCommonParent.Node expected = b;
        LowestCommonParent.Node actual = LowestCommonParent.lcp(g, j, a);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testLowestCommonParent2() {
        LowestCommonParent.Node expected = b;
        LowestCommonParent.Node actual = LowestCommonParent.lcp(b, j, a);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testLowestCommonParent3() {
        LowestCommonParent.Node expected = a;
        LowestCommonParent.Node actual = LowestCommonParent.lcp(i, l, a);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testLowestCommonParent4() {
        LowestCommonParent.Node expected = f;
        LowestCommonParent.Node actual = LowestCommonParent.lcp(k, l, a);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
