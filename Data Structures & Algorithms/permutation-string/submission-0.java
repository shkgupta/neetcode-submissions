class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null){
            return false;
        }

        if(s1.length() > s2.length()){
            return false;
        }
        //lecabee, abc
        int n = s1.length();
        int m = s2.length();

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i=0;i < n ;i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Count, s2Count)){ return true;}

        for(int i=n; i< m; i++){
            s2Count[s2.charAt(i) - 'a']++;
            s2Count[s2.charAt(i-n) - 'a']--;
            if(Arrays.equals(s1Count, s2Count)){ return true;}
        }

        return false;
    }
}