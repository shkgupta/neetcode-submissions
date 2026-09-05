class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n -k +1];
        Deque<Integer> deque = new ArrayDeque<>();
        int ri = 0;
        for(int i = 0; i < n; i++){
            // remove the stale elements outside the windows
            while(!deque.isEmpty() && deque.peekFirst() < (i-k+1)){
                deque.pollFirst();
            }
            // put the increasing value
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }
    
         // 3. Add current element's index to the back of deque
            deque.offerLast(i);

            // 4. Record the max element once the first window of size k is formed
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }

        }

        return result;
    }
}
