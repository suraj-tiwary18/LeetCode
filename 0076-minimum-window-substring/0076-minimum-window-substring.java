class Solution {

    public boolean fun(int[] have, int[] need){
        for(int i=0; i<256; i++){
            if(have[i] < need[i]){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE;
        int m = s.length();
        int n = t.length();
        int start = -1;

        int[] have = new int[256];
        int[] need = new int[256];

        if(m < n){
            return "";
        }

        for(int i=0; i<n; i++){
            need[t.charAt(i)]++;
        }

        for(high=0; high<m; high++){
            have[s.charAt(high)]++;

            while(fun(have, need)){
                int len = high - low + 1;

                if(result > len){
                    result = len;
                    start = low;
                }

                have[s.charAt(low)]--;
                low++;
            }
        }

        if(result == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start, start + result);
    }
}
