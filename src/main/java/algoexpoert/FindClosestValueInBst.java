package algoexpoert;

public class FindClosestValueInBst {
    public static int findClosestValueInBst(BST tree, int target) {
        int closest = tree.value;
        while (tree != null) {
            if (Math.abs(target - tree.value) < Math.abs(target - closest)) {
                closest = tree.value;
            }
            if (tree.value > target) {
                tree = tree.left;
            } else if (tree.value < target){
                tree = tree.right;
            } else {
                return closest;
            }
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
