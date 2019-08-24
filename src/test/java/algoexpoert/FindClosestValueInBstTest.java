package algoexpoert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindClosestValueInBstTest {

    @Test
    public void findClosestValueInBst() {
        FindClosestValueInBst.BST tree = new FindClosestValueInBst.BST(10);
        tree.left = new FindClosestValueInBst.BST(5);
        tree.right = new FindClosestValueInBst.BST(15);
        FindClosestValueInBst.BST leftSubtree = tree.left;
        FindClosestValueInBst.BST rightSubtree = tree.right;
        leftSubtree.left = new FindClosestValueInBst.BST(2);
        leftSubtree.right = new FindClosestValueInBst.BST(5);
        rightSubtree.left = new FindClosestValueInBst.BST(13);
        rightSubtree.right = new FindClosestValueInBst.BST(22);
        leftSubtree.left.left = new FindClosestValueInBst.BST(1);
        rightSubtree.left.right = new FindClosestValueInBst.BST(14);

        int actual = FindClosestValueInBst.findClosestValueInBst(tree, 12);
        Assertions.assertThat(actual).isEqualTo(13);
    }
}
