package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LCSTest {
    
    // Approach-1
    @Test
    public void testApproach1() {
        assertEquals(3, LCS.longestCommonSubsequenceApproach1("abcde", "ace"));
        assertEquals(3, LCS.longestCommonSubsequenceApproach1("abc", "abc"));
        assertEquals(0, LCS.longestCommonSubsequenceApproach1("abc", "def"));
    }

    // Approach-2
    @Test
    public void testApproach2() {
        assertEquals(3, LCS.longestCommonSubsequenceApproach2("abcde", "ace"));
        assertEquals(3, LCS.longestCommonSubsequenceApproach2("abc", "abc"));
        assertEquals(0, LCS.longestCommonSubsequenceApproach2("abc", "def"));
    }

    // Approach-3
    @Test
    public void testApproach3() {
        LCS lcs = new LCS();
        assertEquals(3, lcs.longestCommonSubsequenceApproach3("abcde", "ace"));
        assertEquals(3, lcs.longestCommonSubsequenceApproach3("abc", "abc"));
        assertEquals(0, lcs.longestCommonSubsequenceApproach3("abc", "def"));
    }
}
