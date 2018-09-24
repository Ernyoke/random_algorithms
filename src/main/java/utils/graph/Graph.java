package utils.graph;

import java.util.List;
import java.util.Stack;

public class Graph {
    public List<Edge> edges;
    public List<Vertex> vertices;

    public Graph(List<Edge> edges, List<Vertex> vertices) {
        this.edges = edges;
        this.vertices = vertices;
    }

    public Stack<Vertex> topologicalSort() {
        Stack<Vertex> sorted = new Stack<>();

        return sorted;
    }

    public Stack<Vertex> dfs() {
        vertices.forEach(Vertex::resetVisited);
        Stack<Vertex> result = new Stack<>();
        Stack<Vertex> visitOrder = new Stack<>();
        for (Vertex vertex : vertices) {
            if (!vertex.wasVisited()) {
                visitOrder.push(vertex);
                while (!visitOrder.isEmpty()) {
                    Vertex currentVertex = visitOrder.pop();
                    currentVertex.visit();
                    result.push(currentVertex);
                    for (Vertex neighbour : currentVertex.getNeighbours()) {
                        if (!neighbour.wasVisited()) {
                            visitOrder.push(neighbour);
                        }
                    }
                }
            }
        }
        return result;
    }
}
