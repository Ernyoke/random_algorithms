import java.util.*;

public class Kosaraju {

    public static List<List<Integer>> kosaraju(int g[][]) {
        List<List<Integer>> stronglyConnectedComponents = new ArrayList<>();
        Stack<Integer> dfsStack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < g.length; i++) {
            dfs(i, g, dfsStack, visited);
        }
        Set<Integer> visitedComponentItem = new HashSet<>();
        int t[][] = transpose(g);
        while (!dfsStack.isEmpty()) {
            int node = dfsStack.pop();
            if (!visitedComponentItem.contains(node)) {
                Stack<Integer> stronglyConnectedComponent = new Stack<>();
                dfs(node, t, stronglyConnectedComponent, visitedComponentItem);
                stronglyConnectedComponents.add(stronglyConnectedComponent.subList(0, stronglyConnectedComponent.size()));
            }
        }
        return stronglyConnectedComponents;
    }

    private static void dfs(int node, int g[][], Stack<Integer> dfsStack, Set<Integer> visited) {
        if (!visited.contains(node)) {
            visited.add(node);
            for (int i = 0; i < g[node].length; i++) {
                if (g[node][i] != 0) {
                    dfs(i, g, dfsStack, visited);
                }
            }
            dfsStack.push(node);
        }
    }

    private static int[][] transpose(int g[][]) {
        int t[][] = new int[g.length][g[0].length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                t[i][j] = g[j][i];
            }
        }
        return t;
    }
}
