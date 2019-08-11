import java.util.*;

public class LowestCommonParent {
    static class Node {
        final private String name;
        final private List<Node> children;

        public Node(String name, List<Node> children) {
            this.name = name;
            this.children = children;
        }

        public String getName() {
            return name;
        }

        public List<Node> getChildren() {
            return children;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Node)) {
                return false;
            }
            Node other = (Node) obj;
            return name.equals(other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static Node lcp(Node a, Node b, Node start) {
        Deque<Node> touchedNodesToA = new LinkedList<>();
        findDfs(a, start, touchedNodesToA);
        Deque<Node> touchedNodesToB = new LinkedList<>();
        findDfs(b, start, touchedNodesToB);

        while (!touchedNodesToA.isEmpty()) {
            Node head = touchedNodesToA.pop();
            if (touchedNodesToB.contains(head)) {
                return head;
            }
        }
        return null;
    }

    private static boolean findDfs(Node a, Node start, Deque<Node> touched) {
        touched.push(start);
        if (!start.equals(a)) {
            for (Node child : start.getChildren()) {
                if (findDfs(a, child, touched)) {
                    return true;
                }
            }
            touched.pop();
            return false;
        }
        else {
            return true;
        }
    }
}
