class Solution {
    public boolean isSubsequence(String s, String t) {
        int low = 0;
        int high = 0;

        if(s.length() == 0){
            return true;
        }

        while(high < t.length()){
            if(s.charAt(low) == t.charAt(high)){
                low++;
                high++;
            } else {
                high++;
            }

            if(low == s.length()){
                return true;
            }
        }
        return false;
    }
}