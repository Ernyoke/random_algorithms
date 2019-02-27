import fordfurkelson.FlowNetwork;
import fordfurkelson.FordFurkelson;
import fordfurkelson.graph.Edge;
import fordfurkelson.graph.Vertex;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FordFurkelsonTests {
    @Test
    public void test() {
        Vertex vertex0 = new Vertex(0, "s");
        Vertex vertex1 = new Vertex(1, "A");
        Vertex vertex2 = new Vertex(2, "B");
        Vertex vertex3 = new Vertex(3, "t");

        List<Vertex> vertexList = Arrays.asList(vertex0, vertex1, vertex2, vertex3);

        FlowNetwork flowNetwork = new FlowNetwork(vertexList.size());
        flowNetwork.addEdge(new Edge(vertex0, vertex1, 4));
        flowNetwork.addEdge(new Edge(vertex0, vertex2, 5));
        flowNetwork.addEdge(new Edge(vertex1, vertex3, 7));
        flowNetwork.addEdge(new Edge(vertex2, vertex1, 4));
        flowNetwork.addEdge(new Edge(vertex2, vertex3, 1));

        FordFurkelson fordFurkelson = new FordFurkelson();
        fordFurkelson.solve(flowNetwork, vertex0, vertex3);

        Assertions.assertThat(fordFurkelson.getMaxFlow()).isEqualTo(8);
    }
}
