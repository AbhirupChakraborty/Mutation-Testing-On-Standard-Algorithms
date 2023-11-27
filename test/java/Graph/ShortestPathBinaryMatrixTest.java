package Graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestPathBinaryMatrixTest {
    @Test
    public void testShortestPathBinaryMatrix() {
        ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();

        // Test case 1: Basic test
        int[][] grid1 = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected1 = 4;
        assertEquals(expected1, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid1));

        // Test case 2: No valid path
        int[][] grid2 = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        int expected2 = -1;
        assertEquals(expected2, shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid2));
    }
}
