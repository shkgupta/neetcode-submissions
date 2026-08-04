class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //0,0,0,0
        //-4,-1,-1,0,1,2
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length < 3){
            return res;
        }

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2; i++){
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1, k=nums.length-1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total > 0){
                    k--;
                } else if(total < 0){
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while( j < k && nums[k]==nums[k-1]){
                        k--;
                    }

                    while(j < k && nums[j]==nums[j+1]){
                        j++;
                    }
                    
                    k--;
                    j++;
                }
            }
                   
        }
        return res;
    }
}
