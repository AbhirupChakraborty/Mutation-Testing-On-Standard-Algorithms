package BinarySearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstPositionFinderTest {
    
    @Test
    public void testFirstPosition(){
        FirstPositionFinder fl = new FirstPositionFinder();
        int[] nums = {0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17,18,19,20};
        assertEquals(-1, fl.findFirstPosition(nums,-1));
        assertEquals(-1, fl.findFirstPosition(nums,25));
        assertEquals(5, fl.findFirstPosition(nums,3));
        assertEquals(15, fl.findFirstPosition(nums,8));
        assertEquals(0, fl.findFirstPosition(nums,0));
    }
}
