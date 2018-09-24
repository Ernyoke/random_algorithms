package utils.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vertex {
    private String name;
    private List<Edge> edges = new ArrayList<>();
    private boolean visited;

    public Vertex(String name) {
        this.name = name;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Vertex> getNeighbours() {
        return edges.stream()
                .filter(edge -> edge.getStartPoint() == this)
                .map(edge -> edge.getEndPoint())
                .collect(Collectors.toList());
    }

    public void visit() {
        this.visited = true;
    }

    public void resetVisited() {
        this.visited = false;
    }

    public boolean wasVisited() {
        return this.visited;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
