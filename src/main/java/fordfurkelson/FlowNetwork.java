package fordfurkelson;

import fordfurkelson.graph.Edge;
import fordfurkelson.graph.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FlowNetwork {
    private int numberOfVertices;
    private int numberOfEdges;
    private List<List<Edge>> adjacentList;

    public FlowNetwork(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.numberOfEdges = 0;
        this.adjacentList = new ArrayList<>();
        IntStream.iterate(0, i -> i + 1).limit(numberOfVertices).forEach(i -> adjacentList.add(new ArrayList<>()));
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void addEdge(Edge edge) {
        Vertex v = edge.getSourceVertex();
        Vertex w = edge.getTargetVertex();
        adjacentList.get(v.getId()).add(edge);
        adjacentList.get(w.getId()).add(edge);
        numberOfEdges++;
    }

    public List<Edge> getAdjacentList(Vertex vertex) {
        return adjacentList.get(vertex.getId());
    }
}
