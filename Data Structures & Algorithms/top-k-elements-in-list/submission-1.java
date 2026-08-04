class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        if(nums == null || nums.length < k){
            return result;
        }
            Map<Integer, Integer> countMap = new HashMap();
            for(int num: nums){
                countMap.put(num, countMap.getOrDefault(num,0)+1);
            }

            List<Integer>[] bucket = new List[nums.length+1];

            for(Map.Entry<Integer, Integer> e : countMap.entrySet()){
                if(bucket[e.getValue()] == null){
                    bucket[e.getValue()] = new ArrayList<Integer>();
                }
                bucket[e.getValue()].add(e.getKey());
            }

            int resultIndex = 0;
            for(int i = bucket.length -1; i >= 0 || resultIndex < k; i--){
                List<Integer> items = bucket[i];
                if(items != null){
                    for(Integer item : items){
                    if(resultIndex < k){
                        result[resultIndex++] = item;
                    } else {
                        break;
                    }
                    }
                } 
            }

        return result;
    }
}
