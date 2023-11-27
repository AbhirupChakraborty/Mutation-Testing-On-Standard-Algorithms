package SlidingWindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoOfSubstringContainsThreeCharTest {
    @Test
    public void testApproach1() {
        NoOfSubstringContainsthreeChar solution = new NoOfSubstringContainsthreeChar();
        assertEquals(10, solution.numberOfSubstringsApproch1("abcabc"));
        assertEquals(3, solution.numberOfSubstringsApproch1("aaacb"));
        assertEquals(1, solution.numberOfSubstringsApproch1("abc"));
        //assertEquals(15, solution.numberOfSubstringsApproch1("abcabcabc"));
    }

    @Test
    public void testApproach2() {
        assertEquals(10, NoOfSubstringContainsthreeChar.numberOfSubstringsApproch2("abcabc"));
        assertEquals(3, NoOfSubstringContainsthreeChar.numberOfSubstringsApproch2("aaacb"));
        assertEquals(1, NoOfSubstringContainsthreeChar.numberOfSubstringsApproch2("abc"));
        //assertEquals(15, NoOfSubstringContainsthreeChar.numberOfSubstringsApproch2("abcabcabc"));
    }
}
