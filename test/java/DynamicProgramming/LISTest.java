package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LISTest {
    @Test
    public void testDP() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, LIS.dp(nums));

        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(5, LIS.dp(nums2));

        int[] nums3 = {5, 4, 3, 2, 1};
        assertEquals(1, LIS.dp(nums3));

        int[] nums4 = {3, 4, 5, 10, 9};
        assertEquals(4, LIS.dp(nums4));

        int[] nums5 = {};
        assertEquals(0, LIS.dp(nums5));

        int[] nums6 = {42};
        assertEquals(1, LIS.dp(nums6));
    }

    @Test
    public void testRec() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, LIS.rec(nums, nums.length, 0, Integer.MIN_VALUE));

        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(5, LIS.rec(nums2, nums2.length, 0, Integer.MIN_VALUE));

        int[] nums3 = {5, 4, 3, 2, 1};
        assertEquals(1, LIS.rec(nums3, nums3.length, 0, Integer.MIN_VALUE));

        int[] nums4 = {3, 4, 5, 10, 9};
        assertEquals(4, LIS.rec(nums4, nums4.length, 0, Integer.MIN_VALUE));

        int[] nums5 = {};
        assertEquals(0, LIS.rec(nums5, nums5.length, 0, Integer.MIN_VALUE));

        int[] nums6 = {42};
        assertEquals(1, LIS.rec(nums6, nums6.length, 0, Integer.MIN_VALUE));
    }

    @Test
    public void testBinarySearch() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, LIS.findLISLen(nums));

        // int[] nums2 = {1, 2, 3, 4, 5};
        // assertEquals(5, LIS.findLISLen(nums2));

        int[] nums3 = {5, 4, 3, 2, 1};
        assertEquals(1, LIS.findLISLen(nums3));

        int[] nums4 = {3, 4, 5, 10, 9};
        assertEquals(4, LIS.findLISLen(nums4));

        int[] nums6 = {42};
        assertEquals(1, LIS.findLISLen(nums6));
    }
}
