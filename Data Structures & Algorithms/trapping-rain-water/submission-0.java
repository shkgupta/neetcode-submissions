class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length -1;
        int lmax = height[0], rmax = height[right];
        int result = 0;

        while(left < right){
            if(lmax < rmax){
                left++;
                if(lmax >= height[left]){
                    result += lmax - height[left];
                }else {
                    lmax = height[left];
                }
            } else {
                right--;
                if(rmax >= height[right]){
                    result += rmax - height[right];
                } else {
                    rmax = height[right];
                }
                
            }
        }

        return result;
        
    }
}
