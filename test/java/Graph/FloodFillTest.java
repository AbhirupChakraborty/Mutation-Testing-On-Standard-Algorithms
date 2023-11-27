package Graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FloodFillTest {
    @Test
    public void testFloodFill() {
        FloodFill solution = new FloodFill();

        // Test case 1
        int[][] image1 = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int[][] expected1 = {
            {2, 2, 2},
            {2, 2, 0},
            {2, 0, 1}
        };
        assertArrayEquals(expected1, solution.floodFill(image1, 1, 1, 2));

        // Test case 2
        int[][] image2 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        int[][] expected2 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        assertArrayEquals(expected2, solution.floodFill(image2, 0, 0, 0));
    }
}
