package Backtracking;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.TreeSet;

import org.junit.Test;



public class CombinationTest {
    
    @Test
    public void testNoElement() {
        List<TreeSet<Integer>> result = Combination.combination(new Integer[] {1, 2}, 0);
        assertTrue(result == null);
    }

    @Test
    public void testLengthOne() {
        List<TreeSet<Integer>> result = Combination.combination(new Integer[] {1, 2}, 1);
        assertTrue(result.get(0).iterator().next() == 1);
        assertTrue(result.get(1).iterator().next() == 2);
    }

    @Test
    public void testLengthTwo() {
        List<TreeSet<Integer>> result = Combination.combination(new Integer[] {1, 2}, 2);
        Integer[] arr = result.get(0).toArray(new Integer[2]);
        assertTrue(arr[0] == 1);
        assertTrue(arr[1] == 2);
    }
}
