class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;

        while(l < r) {
            int area = 0;
            if (height[l] < height[r]) {
                area = height[l] * (r - l);
                l++;
            } else {
                area = height[r] * (r - l);
                r--;
            }
            if (area > res) res = area;
        }
        return res;
    }
}