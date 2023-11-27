package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicSubsequenceTest {
    // Approach-1
    @Test
    public void testApproach1() {
        assertEquals(4, LongestPalindromicSubsequence.longestPalindromeSubseqApproach1("bbbab"));
        assertEquals(2, LongestPalindromicSubsequence.longestPalindromeSubseqApproach1("cbbd"));
    }

    // Approach-2
    @Test
    public void testApproach2() {
        assertEquals(4, LongestPalindromicSubsequence.longestPalindromeSubseqApproach2("bbbab"));
        assertEquals(2, LongestPalindromicSubsequence.longestPalindromeSubseqApproach2("cbbd"));
    }

    // Approach-3
    @Test
    public void testApproach3() {
        assertEquals(4, LongestPalindromicSubsequence.longestPalindromeSubseqApproach3("bbbab"));
        assertEquals(2, LongestPalindromicSubsequence.longestPalindromeSubseqApproach3("cbbd"));
    }

    // Approach-4
    @Test
    public void testApproach4() {
        assertEquals(4, LongestPalindromicSubsequence.longestPalindromeSubseqApproach4("bbbab"));
        assertEquals(2, LongestPalindromicSubsequence.longestPalindromeSubseqApproach4("cbbd"));
    }
}
