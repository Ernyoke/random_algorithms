import java.util.*;

public class KClosestVertex {
    public static class Vertex {
        private int x, y;

        public Vertex(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int distanceSqrd(Vertex other) {
            return (other.x - x) * (other.x - x) + (other.y - y) * (other.y - y);
        }

        @Override
        public String toString() {
            return "Vertex{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static Vertex solve(List<Vertex> vertices, Vertex vertex, int k) {
        Queue<Vertex> queue = new PriorityQueue<>((a, b) -> vertex.distanceSqrd(a) - vertex.distanceSqrd(b));
        for (Vertex v : vertices) {
            queue.offer(v);
        }
        Vertex result = null;
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            result = queue.poll();
        }
        return result;
    }
}
