package Graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BipartiteTest {
    @Test
    public void testIsBipartite() {

        // Test case 1: A bipartite graph
        int[][] graph1 = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(Bipartite.isBipartite(graph1));

        // Test case 2: Another bipartite graph
        int[][] graph2 = {
            {1, 2, 3},
            {0, 2},
            {0, 1, 3},
            {0, 2}
        };
        assertFalse(Bipartite.isBipartite(graph2));

        // Test case 3: Not a bipartite graph
        int[][] graph3 = {
            {1, 2, 3},
            {0, 2},
            {0, 1},
            {0, 2}
        };
        assertFalse(Bipartite.isBipartite(graph3));

        // Test case 4: Empty graph
        int[][] graph4 = {};
        assertTrue(Bipartite.isBipartite(graph4));

        // Test case 5: Single node graph
        int[][] graph5 = {{}};
        assertTrue(Bipartite.isBipartite(graph5));
    }
}
