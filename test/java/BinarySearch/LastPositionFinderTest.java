package BinarySearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastPositionFinderTest {
    
    @Test
    public void testLastPosition(){
        LastPositionFinder lp = new LastPositionFinder();
        int[] nums = {0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,19,20};
        assertEquals(-1, lp.findLastPosition(nums,-1));
        assertEquals(-1, lp.findLastPosition(nums,25));
        assertEquals(6, lp.findLastPosition(nums,3));
        assertEquals(16, lp.findLastPosition(nums,8));
        assertEquals(32, lp.findLastPosition(nums,16));
    }
}
