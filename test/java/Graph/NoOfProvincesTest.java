package Graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoOfProvincesTest {
    @Test
    public void testFindCircleNum() {

        // Test case 1
        int[][] isConnected1 = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        assertEquals(2, NoOfProvinces.findCircleNum(isConnected1));

        // Test case 2
        int[][] isConnected2 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        assertEquals(3, NoOfProvinces.findCircleNum(isConnected2));

        // Test case 3
        int[][] isConnected3 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        assertEquals(1, NoOfProvinces.findCircleNum(isConnected3));

        // Test case 4
        int[][] isConnected4 = {
            {1, 0, 0, 1},
            {0, 1, 1, 0},
            {0, 1, 1, 1},
            {1, 0, 1, 1}
        };
        assertEquals(1, NoOfProvinces.findCircleNum(isConnected4));
    }
}
