package String;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LongestNonRepSubstringTest {
    @Test
    public void palindrome() {
        String input1 = "HelloWorld";
        String input2 = "javaIsAProgrammingLanguage";
        assertEquals(LongestNonRepSubstring.lengthOfLongestSubstring(input1), 5);
        assertEquals(LongestNonRepSubstring.lengthOfLongestSubstring(input2), 9);
    }
}
