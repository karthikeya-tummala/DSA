class Solution {
    public int[] lowHigh(int[] arr) {
        int[] ans = {Integer.MAX_VALUE, -1};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < ans[0]) ans[0] = arr[i];
            if (arr[i] > ans[1]) ans[1] = arr[i];
        }
        return ans;
    }

    public int number(int[] arr, int day, int flowers) {
        int count = 0;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            }
            else {
                number += count / flowers;
                count = 0;
            }
        }
        number += count / flowers;
        return number;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) return -1;
        int[] par = lowHigh(bloomDay);
        int low = par[0], high = par[1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int bouques = number(bloomDay, mid, k);
            if (bouques >= m) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}