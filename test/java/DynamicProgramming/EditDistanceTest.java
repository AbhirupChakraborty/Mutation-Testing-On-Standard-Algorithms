package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EditDistanceTest {
    @Test
	public void testMinDistance() {
		EditDistance ed = new EditDistance(); 
		assertEquals(4, ed.minDistance("abcde", "a")); 	
		assertEquals(0, ed.minDistance("a", "a")); 
		assertEquals(1, ed.minDistance("bb", "abb")); 
		assertEquals(2, ed.minDistance("abba", "abccba")); 
	}
}
