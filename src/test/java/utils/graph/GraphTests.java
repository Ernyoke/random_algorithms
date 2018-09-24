package utils.graph;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GraphTests {
    private Graph graph;

    private Vertex v1;
    private Vertex v2;
    private Vertex v3;
    private Vertex v4;
    private Vertex v5;
    private Vertex v6;
    private Vertex v7;

    private Edge e1;
    private Edge e2;
    private Edge e3;
    private Edge e4;
    private Edge e5;
    private Edge e6;


    @Before
    public void setUp() {
        v1 = new Vertex("A");
        v2 = new Vertex("B");
        v3 = new Vertex("C");
        v4 = new Vertex("D");
        v5 = new Vertex("E");
        v6 = new Vertex("F");
        v7 = new Vertex("G");
        List<Vertex> vertices = Arrays.asList(v1, v2, v3, v4, v5, v6, v7);

        e1 = new Edge(v1, v2, 2);
        e2 = new Edge(v1, v3, 5);
        e3 = new Edge(v4, v1, 4);
        e4 = new Edge(v4, v5, 1);
        e5 = new Edge(v4, v2, 10);
        e6 = new Edge(v6, v7, 9);
        List<Edge> edges = Arrays.asList(e1, e2, e3, e4, e5, e6);

        graph = new Graph(edges, vertices);
    }

    @Test
    public void testDfs() {
        Stack<Vertex> actual = graph.dfs();
        Stack<Vertex> expected = new Stack<>();
        expected.push(v7);
        expected.push(v6);
        expected.push(v5);
        expected.push(v4);
        expected.push(v2);
        expected.push(v3);
        expected.push(v1);
        for (Vertex v : actual) {
            Vertex e = expected.pop();
            Assertions.assertThat(v).isEqualTo(e);
        }
        Assertions.assertThat(expected.size()).isEqualTo(0);
    }
}
