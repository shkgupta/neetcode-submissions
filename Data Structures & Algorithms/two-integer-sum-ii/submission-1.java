class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = null;

        int L = 1, R = numbers.length;

        while(L < R){
            int r = numbers[L-1] + numbers[R-1] - target;
            if(r == 0){
                return new int[]{L, R};
            }else if(r > 0){
                R--;
            }else {
                L++;
            }
            }

        return result;
    }
}
