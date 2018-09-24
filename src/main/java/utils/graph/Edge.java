package utils.graph;

public class Edge {
    public Vertex startPoint;
    public Vertex endPoint;
    public int weight;

    public Edge(Vertex startPoint, Vertex endPoint, int weight) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.weight = weight;

        this.startPoint.addEdge(this);
        this.endPoint.addEdge(this);
    }

    public Vertex getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Vertex startPoint) {
        this.startPoint = startPoint;
        this.startPoint.addEdge(this);
    }

    public Vertex getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Vertex endPoint) {
        this.endPoint = endPoint;
        this.endPoint.addEdge(this);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
