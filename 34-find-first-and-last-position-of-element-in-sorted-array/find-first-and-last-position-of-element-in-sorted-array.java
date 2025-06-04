class Solution {
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target || nums[mid] > target) high = mid - 1;
            else if (nums[mid] < target) low = mid + 1;

        }
        return (low < nums.length && nums[low] == target) ? low : -1;

    }

    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target || nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return (high >= 0 && nums[high] == target) ? high : -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = lowerBound(nums, target);
        ans[1] = upperBound(nums,target);
        return ans;
    }
}