package SlidingWindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterReplacementTest {
    CharacterReplacement cr = new CharacterReplacement();
    @Test
    public void testBruteForce() {
        assertEquals(4, CharacterReplacement.crBrute("ABAB", 2));
        assertEquals(4, CharacterReplacement.crBrute("AABABBA", 1));
    }

    @Test
    public void testBetterApproach() {
        assertEquals(4, CharacterReplacement.crBetter("ABAB", 2));
        assertEquals(4, CharacterReplacement.crBetter("AABABBA", 1));
    }

    @Test
    public void testOptimalApproach() {
        assertEquals(4, CharacterReplacement.crOptimal("ABAB", 2));
        assertEquals(4, CharacterReplacement.crOptimal("AABABBA", 1));
    }
}
