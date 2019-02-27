package fordfurkelson.graph;

public class Edge {
    private Vertex sourceVertex;
    private Vertex targetVertex;
    private final double capacity;
    private double flow;

    public Edge(Vertex sourceVertex, Vertex targetVertex, double capacity) {
        this.sourceVertex = sourceVertex;
        this.targetVertex = targetVertex;
        this.capacity = capacity;
    }

    public Edge(Edge edge) {
        this.sourceVertex = edge.getSourceVertex();
        this.targetVertex = edge.getSourceVertex();
        this.capacity = edge.getCapacity();
        this.flow = edge.getFlow();
    }

    public Vertex getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(Vertex sourceVertex) {
        this.sourceVertex = sourceVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }

    public Vertex getOtherVertex(Vertex vertex) {
        if (vertex == sourceVertex) {
            return targetVertex;
        }
        return sourceVertex;
    }

    public double getResidualCapacity(Vertex vertex) {
        if (sourceVertex == vertex) {
            return flow;
        }
        return capacity - flow;
    }

    public void addResidualFlowTo(Vertex vertex, double deltaFlow) {
        if (vertex == sourceVertex) {
            flow -= deltaFlow;
        } else {
            flow += deltaFlow;
        }
    }
}
