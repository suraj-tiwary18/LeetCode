class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int bestending = nums[0];

        for(int i=1; i<n; i++){
            int v1 = nums[i];
            bestending = bestending + nums[i];

            bestending = Math.max(bestending, v1);

            res = Math.max(res, bestending);
        }
        return res;
    }
}