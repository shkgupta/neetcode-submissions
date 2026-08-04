class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int result = n;
        int i = 1;
        while(i < n){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }

            int inc = 0;
            while (i < n && ratings[i] > ratings[i-1]){
                inc++;
                result += inc;
                i++;
            }

            int dec = 0;

            while(i < n && ratings[i] < ratings[i-1]){
                dec++;
                result += dec;
                i++;
            }
            result -= Math.min(dec, inc);
        }

        return result;
        
    }
}