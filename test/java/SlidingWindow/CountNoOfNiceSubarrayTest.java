package SlidingWindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNoOfNiceSubarrayTest {
    @Test
    public void testApproach1() {
        assertEquals(2, CountNoOfNiceSubarray.numberOfSubarraysApproach1(new int[]{1,1,2,1,1}, 3));
        assertEquals(0, CountNoOfNiceSubarray.numberOfSubarraysApproach1(new int[]{2,4,6}, 1));
        assertEquals(16, CountNoOfNiceSubarray.numberOfSubarraysApproach1(new int[]{2,2,2,1,2,2,1,2,2,2}, 2));
    }

    @Test
    public void testApproach2() {
        assertEquals(2, CountNoOfNiceSubarray.numberOfSubarraysApproach2(new int[]{1,1,2,1,1}, 3));
        assertEquals(0, CountNoOfNiceSubarray.numberOfSubarraysApproach2(new int[]{2,4,6}, 1));
        assertEquals(16, CountNoOfNiceSubarray.numberOfSubarraysApproach2(new int[]{2,2,2,1,2,2,1,2,2,2}, 2));
    }
}
