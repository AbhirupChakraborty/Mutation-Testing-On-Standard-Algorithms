package DynamicProgramming;

import java.util.*;

public class CoinChange {
    //DP Opt:
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;

        int[] dp = new int[max];
        Arrays.fill(dp, max);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int x : coins) {
                if (i >= x) {
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount]; 
    }
}

// //Memory DFS:
// class Solution1 {
//     public static int coinChange1(int[] coins, int amount) {
//         if (amount <= 0) {
//             return 0;
//         }

//         return coinChangehelper(coins, amount, new int[amount]);
//     }

//     public static int coinChangehelper(int[] coins, int rem, int[] count) {
//         if (rem < 0) {
//             return -1;
//         }

//         if (rem == 0) {
//             return 0;
//         }

//         if (count[rem - 1] != 0) {
//             return count[rem - 1];
//         }

//         int min = Integer.MAX_VALUE;
//         for (int coin : coins) {
//             int res = coinChangehelper(coins, rem - coin, count);
//             if (res >= 0 && res < min) {
//                 min = 1 + res;
//             }
//         }
//         count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
//         return count[rem - 1];
//     }
// }
// //BFS Opt:

// class Solution2 {
//     public static int coinChange2(int[] coins, int amount) {
//         if (amount <= 0) {
//             return 0;
//         }

//         Arrays.sort(coins);

//         Queue<Integer> queue = new LinkedList<>();
//         queue.offer(amount);

//         boolean[] visited = new boolean[amount + 1];
//         visited[amount] = true;

//         int step = 1;
//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 0; i < size; i++) {
//                 Integer cur = queue.poll();
//                 for (int x : coins) {
//                     int target = cur - x;
//                     if (target == 0) {
//                         return step;
//                     }
//                     if (target < 0) {
//                         break;
//                     }
//                     if (!visited[target]) {
//                         visited[target] = true;
//                         queue.offer(target);
//                     }
//                 }
//             }

//             step++;
//         }

//         return -1;   
//     }
// }