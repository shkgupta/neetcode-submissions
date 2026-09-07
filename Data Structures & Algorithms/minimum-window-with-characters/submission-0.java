class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || t.length() > s.length()){
            return "";
        }

        int[] freq = new int[128];
        int needed = t.length();
        int startInx = -1, left = 0, minL = Integer.MAX_VALUE;
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            freq[c]++;
        }

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(freq[c] > 0){
                needed--;
            }
            freq[c]--;
            // start of window

            while(needed == 0){
                int curL = right - left +1;
                if(curL < minL){
                    minL = curL;
                    startInx = left;
                }

                char lc = s.charAt(left);
                freq[lc]++;
                if(freq[lc]>0){
                    needed++;
                }
                left++;
            }
        }

        return startInx == -1 ? "" : s.substring(startInx, startInx+minL);
    }
}
