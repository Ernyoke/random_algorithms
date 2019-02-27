package fordfurkelson;

import fordfurkelson.graph.Edge;
import fordfurkelson.graph.Vertex;

import java.util.LinkedList;
import java.util.Queue;

// Edmonds-Karp implementation
public class FordFurkelson {
    private boolean[] marked;
    private Edge[] edgeTo;
    private double maxFlow;

    public void solve(FlowNetwork flowNetwork, Vertex source, Vertex sink) {
        while (hasAugmentingPath(flowNetwork, source, sink)) {
            double bottleNeck = Double.POSITIVE_INFINITY;
            for (Vertex v = sink; v != source; v = edgeTo[v.getId()].getOtherVertex(v)) {
                bottleNeck = Math.min(bottleNeck, edgeTo[v.getId()].getResidualCapacity(v));
            }
            for (Vertex v = sink; v != source; v = edgeTo[v.getId()].getOtherVertex(v)) {
                edgeTo[v.getId()].addResidualFlowTo(v, bottleNeck);
            }
            maxFlow += bottleNeck;
        }
    }

    private boolean hasAugmentingPath(FlowNetwork flowNetwork, Vertex source, Vertex sink) {
        edgeTo = new Edge[flowNetwork.getNumberOfVertices()];
        marked = new boolean[flowNetwork.getNumberOfVertices()];
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(source);
        marked[source.getId()] = true;
        while (!queue.isEmpty() && !marked[sink.getId()]) {
            Vertex v = queue.remove();
            for (Edge e: flowNetwork.getAdjacentList(v)) {
                Vertex w = e.getOtherVertex(v);
                if (e.getResidualCapacity(w) > 0) {
                    if (!marked[w.getId()]) {
                        edgeTo[w.getId()] = e;
                        marked[w.getId()] = true;
                        queue.add(w);
                    }
                }
            }
        }
        return marked[sink.getId()];
    }

    public double getMaxFlow() {
        return maxFlow;
    }

    public boolean isInCut(int index) {
        return marked[index];
    }
}
