class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        if(nums != null){
        int left = 0, rt = nums.length;
        result = nums[0] == target ? 0 : -1;
        while(result == -1 && left < rt){
            int mid = left + (rt - left)/2;
            System.out.println(left + ", " + mid +", " + rt);
            if(target == nums[mid]){
                result = mid;
            }
            if(nums[mid] > target){
                rt = mid;
            } else {
                left = mid+1;
            }
        }
        }
        return result;
    }
}
