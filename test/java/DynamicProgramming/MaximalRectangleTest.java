package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximalRectangleTest {
     @Test
    public void testMaximalRectangle() {
        MaximalRectangle maximalRectangle = new MaximalRectangle();

        // Test case 1
        char[][] matrix1 = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertEquals(6, maximalRectangle.maximalRectangle(matrix1));

        // Test case 2
        char[][] matrix2 = {{'0'}};
        assertEquals(0, maximalRectangle.maximalRectangle(matrix2));

        // Test case 3
        char[][] matrix3 = {{'1'}};
        assertEquals(1, maximalRectangle.maximalRectangle(matrix3));
    }
}
