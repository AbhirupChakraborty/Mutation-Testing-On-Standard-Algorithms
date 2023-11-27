package DynamicProgramming;

import java.util.Arrays;

public class LCS {
    //Approach-1
    public static int longestCommonSubsequenceApproach1(String text1, String text2) {
        int result = helper1(text1, text1.length() - 1, text2, text2.length() - 1);
        return result;
    }
    public static int helper1(String text1, int indexOne, String text2, int indexTwo) {
        if(indexOne < 0 || indexTwo < 0) return 0;

        if(text1.charAt(indexOne) == text2.charAt(indexTwo)) return 1 + helper1(text1, indexOne - 1, text2, indexTwo - 1);

        return Math.max(helper1(text1, indexOne - 1, text2, indexTwo), helper1(text1, indexOne, text2, indexTwo - 1));
    }

    //Approach-2
    public static int longestCommonSubsequenceApproach2(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        int result = helper2(text1, n - 1, text2, m - 1, dp);
        return result;
    }
    public static int helper2(String text1, int i, String text2, int j, int[][]dp) {
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + helper2(text1, i - 1, text2, j - 1, dp);
            return dp[i][j];
        }

        dp[i][j] = Math.max(helper2(text1, i - 1, text2, j, dp), helper2(text1, i, text2, j - 1, dp));
        return dp[i][j];
    }

    //Approach-3
    public int longestCommonSubsequenceApproach3(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        // Shift index ie 0 -> -1, 1 -> 0 and so on n -> n - 1
        int[][] dp = new int[n + 1][m + 1];

        // Base Case:
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for(int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
