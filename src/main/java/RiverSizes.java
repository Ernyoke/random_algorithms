import java.util.*;

class Pair {
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (x != pair.x) return false;
        return y == pair.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

public class RiverSizes {

    public static ArrayList<Integer> riverSizes(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Pair> visited = new HashSet<>();
        Queue<Pair> queue = new ArrayDeque<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Pair p = new Pair(i, j);
                if (matrix[i][j] == 1 && !visited.contains(p)) {
                    queue.offer(p);
                    visited.add(p);
                    result.add(traverse(matrix, queue, visited));
                }
            }
        }
        return result;
    }

    private static int traverse(int[][] matrix, Queue<Pair> queue, Set<Pair> visited) {
        int counter = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            counter++;
            List<Pair> neighbours = getNeighbours(matrix, p, visited);
            for (Pair neighbour : neighbours) {
                visited.add(neighbour);
                queue.offer(neighbour);
            }
        }
        return counter;
    }

    private static List<Pair> getNeighbours(int[][] matrix, Pair p, Set<Pair> visited) {
        final List<Pair> MOVES = Arrays.asList(new Pair(-1, 0),
                new Pair(1, 0), new Pair(0, -1), new Pair(0, 1));
        List<Pair> result = new ArrayList<>();
        for (Pair move : MOVES) {
            int x = p.getX() + move.getX();
            int y = p.getY() + move.getY();
            if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] == 1) {
                Pair elem = new Pair(x, y);
                if (!visited.contains(elem)) {
                    result.add(elem);
                }
            }
        }
        return result;
    }
}
