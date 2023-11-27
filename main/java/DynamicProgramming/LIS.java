package DynamicProgramming;

import java.util.Arrays;

public class LIS {

    public static int findLISLen(int a[]) {
        int size = a.length;
        int arr[] = new int[size];
        arr[0] = a[0];
        int lis = 1;
        for (int i = 1; i < size; i++) {
            int index = binarySearchBetween(arr, lis, a[i]);
            arr[index] = a[i];
            if (index > lis) {
                lis++;
            }
        }
        return lis;
    }

    // O(logn)
    public static int binarySearchBetween(int[] t, int end, int key) {
        int left = 0;
        int right = end;
        if (key < t[0]) {
            return 0;
        }
        if (key > t[end]) {
            return end + 1;
        }
        while (left < right - 1) {
            int middle = (left + right) / 2;
            if (t[middle] < key) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right;
    }

    public static int dp(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        int longest = 0;
        for (int c: dp) {
            longest = Math.max(longest, c);
        }
        
        return longest;
    }

    public static int rec(int[] nums, int n, int curr, int prev){
        if(curr >= n) return 0;
        int left = 0;
        if(prev == Integer.MIN_VALUE || prev <nums[curr])
            left = rec(nums, n, curr+1, nums[curr])+1;
        int right = rec(nums, n, curr+1, prev);
        int val = Math.max(left, right);
        return val;
    }
}
