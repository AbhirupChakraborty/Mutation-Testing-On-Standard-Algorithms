package DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void testDP() {
        // Test case 1
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        assertEquals(3, CoinChange.coinChange(coins1, amount1));

        // Test case 2
        int[] coins2 = {2};
        int amount2 = 3;
        assertEquals(-1, CoinChange.coinChange(coins2, amount2));

        // Test case 3
        int[] coins3 = {1};
        int amount3 = 0;
        assertEquals(0, CoinChange.coinChange(coins3, amount3));

        // Test case 4
        int[] coins4 = {1};
        int amount4 = 2;
        assertEquals(2, CoinChange.coinChange(coins4, amount4));
    }
}
