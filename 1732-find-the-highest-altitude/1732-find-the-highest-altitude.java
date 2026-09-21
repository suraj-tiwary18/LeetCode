class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int res = 0;
        int n = gain.length;

        for(int i=0; i<n; i++){
            sum += gain[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}