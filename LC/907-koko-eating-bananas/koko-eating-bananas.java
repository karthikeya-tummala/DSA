class Solution {
    public static int findHours (int[] arr, int speed) {
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += Math.ceil((double) arr[i] / speed);
        }
        return time;
    }

    public static int max(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) ans = arr[i];
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Solution.max(piles);
        while (high >= low) {
            int mid = low + (high - low) / 2;
            int time = findHours(piles, mid);
            if (time <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}