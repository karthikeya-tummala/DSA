class Solution {
    public boolean containsDuplicate(int[] nums) {
        System.gc();
        HashSet<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        return set.size() != nums.length;
    }
}