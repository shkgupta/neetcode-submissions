
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        Map sMap = Arrays.stream(s.split(""))
                       .collect(java.util.stream.Collectors.groupingBy(
                           java.util.function.Function.identity(),
                           java.util.stream.Collectors.counting()));
        Map tMap = Arrays.stream(t.split(""))
                       .collect(java.util.stream.Collectors.groupingBy(
                           java.util.function.Function.identity(),
                           java.util.stream.Collectors.counting()));
        if (sMap.equals(tMap)) {
            return true;
        }

        return false;
    }
}