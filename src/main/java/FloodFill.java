import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FloodFill {
    private static boolean[][] getTraversableArea(int[][] area) {
        boolean[][] areaCopy = new boolean[area.length][];
        for (int i = 0; i < areaCopy.length; i++) {
            int[] row = area[i];
            areaCopy[i] = new boolean[row.length];
            for (int j = 0; j < row.length; j++) {
                if (area[i][j] == 0) {
                    areaCopy[i][j] = true;
                }
            }
        }
        return areaCopy;
    }

    private static List<Pair<Integer, Integer>> getNeighbours(boolean[][] traversableArea, Pair<Integer, Integer> position) {
        List<Pair<Integer, Integer>> possibleSteps = new ArrayList<>();
        int x = position.getKey();
        int y = position.getValue();
        if (x - 1 >= 0 && traversableArea[x - 1][y]) {
            possibleSteps.add(new Pair<>(x - 1, y));
        }
        if (x + 1 < traversableArea.length && traversableArea[x + 1][y]) {
            possibleSteps.add(new Pair<>(x + 1, y));
        }
        if (y - 1 >= 0 && traversableArea[x][y - 1]) {
            possibleSteps.add(new Pair<>(x, y - 1));
        }
        if (y + 1 < traversableArea[x].length && traversableArea[x][y + 1]) {
            possibleSteps.add(new Pair<>(x, y + 1));
        }
        return possibleSteps;
    }

    public static boolean solve(int [][] area, int startX, int startY) {
        boolean[][] traversableArea = getTraversableArea(area);
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        if (traversableArea[startX][startY]) {
            stack.push(new Pair<>(startX, startY));
            traversableArea[startX][startY] = false;
            while (!stack.empty()) {
                Pair<Integer, Integer> currentPosition = stack.pop();
                List<Pair<Integer, Integer>> neighbours = getNeighbours(traversableArea, currentPosition);
                neighbours.forEach(position -> {
                    stack.push(position);
                    traversableArea[position.getKey()][position.getValue()] = false;
                });
            }
        }
        for (boolean[] row : traversableArea) {
            for (boolean val : row) {
                if (val) {
                    return false;
                }
            }
        }
        return true;
    }
}
