package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void testSolution1() {
        Solution1 solution = new Solution1();

        // Test case 1
        int[] nums1 = {2, 3, 2};
        assertEquals(3, solution.rob(nums1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums2));

        // Test case 3
        int[] nums3 = {0};
        assertEquals(0, solution.rob(nums3));

        // Test case 4
        int[] nums4 = {1, 2};
        assertEquals(2, solution.rob(nums4));
    }

    @Test
    public void testSolution2() {
        Solution2 solution = new Solution2();

        // Test case 1
        int[] nums1 = {2, 3, 2};
        assertEquals(3, solution.rob(nums1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums2));

        // Test case 3
        int[] nums3 = {0};
        assertEquals(0, solution.rob(nums3));

        // Test case 4
        int[] nums4 = {1, 2};
        assertEquals(2, solution.rob(nums4));
    }

    @Test
    public void testSolution3() {
        Solution3 solution = new Solution3();

        // Test case 1
        int[] nums1 = {2, 3, 2};
        assertEquals(3, solution.rob(nums1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums2));

        // Test case 3
        int[] nums3 = {0};
        assertEquals(0, solution.rob(nums3));

        // Test case 4
        int[] nums4 = {1, 2};
        assertEquals(2, solution.rob(nums4));
    }
}
