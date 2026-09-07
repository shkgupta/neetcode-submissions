class Solution {
    public boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        int left = 0, right = s.length() -1;
        while(left < right){
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            boolean valid = true;
            if(!isValid(lc)){
                left++;
                valid = false;
            }
            
            if(!isValid(rc)){
                right--;
                valid = false;
            }

            if(valid){
             if(Character.toLowerCase(lc) == Character.toLowerCase(rc)){   
             left++;
             right--;
             } else {
             return false;
             }
            }
        }
        return true;
    }

    public boolean isValid(char c){
        boolean res = (c >= 'a' && c <= 'z') 
        || (c >= 'A' && c <= 'Z') 
        || (c >= '0' && c <= '9');

       // System.out.println(c +" is valid " +res);

        return res;
    }
}
