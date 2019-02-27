import utils.binarytree.Node;

public class InvertBineryTree<T> {
    public Node<T> solve(Node<T> tree) {
        Node<T> inverted = new Node<>(tree.getValue());
        dfsInvert(tree, inverted);
        return inverted;
    }

    private void dfsInvert(Node<T> original, Node<T> inverted) {
        if (original != null) {
            if (original.getLeft() != null) {
                inverted.setRight(new Node<>(original.getLeft().getValue()));
                dfsInvert(original.getLeft(), inverted.getRight());
            }
            if (original.getRight() != null) {
                inverted.setLeft(new Node<>(original.getRight().getValue()));
                dfsInvert(original.getRight(), inverted.getLeft());
            }
        }
    }
}
