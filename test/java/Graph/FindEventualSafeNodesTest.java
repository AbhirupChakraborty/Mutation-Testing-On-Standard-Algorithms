package Graph;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindEventualSafeNodesTest {
    @Test
    public void testEventualSafeNodes() {

        // Test case 1: Basic test
        int[][] graph1 = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        List<Integer> expected1 = Arrays.asList(2, 4, 5, 6);
        assertEquals(expected1, FindEventualSafeNodes.eventualSafeNodes(graph1));

        // Test case 2: Basic test 2
        int[][] graph2 = {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        List<Integer> expected2 = Arrays.asList(4);
        assertEquals(expected2, FindEventualSafeNodes.eventualSafeNodes(graph2));
    }
}
