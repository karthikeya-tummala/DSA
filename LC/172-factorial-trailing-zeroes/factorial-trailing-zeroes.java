class Solution {
    public int trailingZeroes(int n) {
        if (n <= 0) return 0;
        int ans = 0;
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        return ans;
    }
}