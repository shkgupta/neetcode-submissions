class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(int i =0; i < strs.length ; i++){
            String start = strs[i].toLowerCase();
            TreeMap<String, Long> sMap = Arrays.stream(start.split("")).filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), TreeMap::new, java.util.stream.Collectors.counting()));
            StringBuilder b = new StringBuilder();
            sMap.forEach((key, value) -> b.append(key).append(value));
            result.computeIfAbsent(b.toString(), k -> new ArrayList<String>()).add(strs[i]);
        }
        return new ArrayList(result.values());
    }
}
