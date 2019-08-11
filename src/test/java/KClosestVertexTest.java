import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KClosestVertexTest {

    @Test
    public void solve() {
        List<KClosestVertex.Vertex> vertices = Arrays.asList(
                new KClosestVertex.Vertex(1, 2),
                new KClosestVertex.Vertex(3, -1),
                new KClosestVertex.Vertex(2, 1),
                new KClosestVertex.Vertex(2, 3));
        KClosestVertex.Vertex vertex = new KClosestVertex.Vertex(2, 2);
        int k = 2;
        System.out.println(KClosestVertex.solve(vertices, vertex, k));
    }
}
