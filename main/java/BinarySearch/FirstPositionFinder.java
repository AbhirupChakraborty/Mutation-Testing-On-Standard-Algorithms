package BinarySearch;

public class FirstPositionFinder {
    public int findFirstPosition(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int firstPosition = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstPosition = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return firstPosition;
    }
}
