class Solution {
    public int maxArea(int[] heights) {
        int L = 0, R = heights.length -1;
        int maxArea = 0;
        while(L < R){
            int w = R - L;
            if(heights[L] < heights[R]){
                maxArea = Math.max(maxArea,heights[L]*w);
                L++;
            }else {
                maxArea = Math.max(maxArea,heights[R]*w);
                R--;
            }
        }

        return maxArea;
        
    }
}
