class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        int low = 0;
        int high = n - 1;

        if(n == 0){
            return 0;
        }

        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return 2; 
            }
            low++;
            high--;
        }
        return 1;
    }
}