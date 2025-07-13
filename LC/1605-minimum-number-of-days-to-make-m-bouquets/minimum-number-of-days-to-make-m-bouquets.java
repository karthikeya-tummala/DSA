class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int val : bloomDay) {
            if (val < low) low = val;
            if (val > high) high = val;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0, bouquets = 0;

            for (int val : bloomDay) {
                if (val <= mid) {
                    count++;
                    if (count == k) {
                        bouquets++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouquets >= m) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}