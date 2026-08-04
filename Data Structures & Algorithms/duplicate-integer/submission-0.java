class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> test = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!test.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}