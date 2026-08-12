class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int p = 0;
//prices=[1,2,4,2,5,7,2,4,9,0,9]

        for(int i = 1; i < prices.length; i++){
            int diff = prices[i] - prices[p];
            if(diff  > 0){
                max = Math.max(max, prices[i] - prices[p]);   
            } else {
                p = i;
            }
        }
        return max;
    }
}
