class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if(m > n){
            return -1;
        }

        for(int high=0; high <= n - m; high++){
            int low  = 0;

            while(low < m && haystack.charAt(high + low) == needle.charAt(low)){
                low++;
            }

            if(low == m){
                return high;
            }
        }
        return -1;
    }
}