import org.assertj.core.api.Assertions;
import org.junit.Test;
import utils.binarytree.Node;

public class InvertBineryTreeTests {
    @Test
    public void test() {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C", nodeA, nodeB);
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F", nodeD, nodeE);
        Node<String> nodeG = new Node<>("G", nodeC, nodeF);

        InvertBineryTree<String> invertBineryTree = new InvertBineryTree<>();
        Node<String> inverted = invertBineryTree.solve(nodeG);

        Assertions.assertThat(inverted.getValue()).isEqualTo("G");
        Assertions.assertThat(inverted.getLeft().getValue()).isEqualTo("F");
        Assertions.assertThat(inverted.getRight().getValue()).isEqualTo("C");
        Assertions.assertThat(inverted.getLeft().getLeft().getValue()).isEqualTo("E");
        Assertions.assertThat(inverted.getLeft().getRight().getValue()).isEqualTo("D");
        Assertions.assertThat(inverted.getRight().getLeft().getValue()).isEqualTo("B");
        Assertions.assertThat(inverted.getRight().getRight().getValue()).isEqualTo("A");
    }
}
