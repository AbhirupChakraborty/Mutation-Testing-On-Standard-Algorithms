package String;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class ValidParenthesesTest {
    @Test
    public void testValidParentheses(){
        assertEquals(true, ValidParentheses.ValidCheck("()"));
        assertEquals(true, ValidParentheses.ValidCheck("()[]{}"));
        assertEquals(false, ValidParentheses.ValidCheck("(]"));
        assertEquals(true, ValidParentheses.ValidCheck("()()"));
        assertEquals(false, ValidParentheses.ValidCheck("}{"));
        assertEquals(true, ValidParentheses.ValidCheck("[]"));
    }
}
