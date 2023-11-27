package Trie;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberofDistinctSubstringTest {

	@Test
	public  void main() {
	    String s1 = "ababa";
	    assertEquals(10, NumberofDistinctSubstring.countDistinctSubstrings(s1));

	    String s2 = "ccfdf";
	    assertEquals(14, NumberofDistinctSubstring.countDistinctSubstrings(s2));

	  }
}
