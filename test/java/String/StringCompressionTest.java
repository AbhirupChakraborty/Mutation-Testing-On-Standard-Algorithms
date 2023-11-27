package String;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class StringCompressionTest {

    private String input;
    private String expectedOutput;

    public StringCompressionTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                {"a", "a"},
                {"aabbb", "a2b3"},
                {"abbbc", "ab3c"},
                {"aabccd", "a2bc2d"}
        });
    }

    @Test
    public void stringCompressionTest() {
        String output = StringCompression.compress(input);
        assertEquals(expectedOutput, output);
    }
}