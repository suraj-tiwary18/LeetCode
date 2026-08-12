class Solution {

    int find(int[] a){
        int maxc = -1;

        for(int i = 0; i < 256; i++){
            maxc = Math.max(maxc, a[i]);
        }
        return maxc;
    }

    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;
        int n = s.length();

        int[] f = new int[256];
        for(high=0; high < n; high++){

            f[s.charAt(high)]++;

            int len = high - low + 1;
            int maxcount = find(f);
            int diff = len - maxcount;

            while(diff > k){
                f[s.charAt(low)]--;
                low++;
                maxcount = find(f);
                len = high - low + 1;
                diff = len - maxcount;
            }

            len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}