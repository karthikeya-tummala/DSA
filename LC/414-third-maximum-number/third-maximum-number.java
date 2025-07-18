class Solution {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int i = 0; i < nums.length; i++) {
            Long n = (long) nums[i];
            if (n.equals(first) ||
             n.equals(second) ||
             n.equals(third)) continue;

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
             }

            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third == null || n > third){
                third = n;
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }
}