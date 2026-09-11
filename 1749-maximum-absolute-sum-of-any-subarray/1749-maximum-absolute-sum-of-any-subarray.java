class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int n = nums.length;

        for(int i=0; i<n; i++){

            if(i > 0){
                int v1 = nums[i];
                int v2 = maxSum + nums[i];
                int v3 = minSum + nums[i];

                maxSum = Math.max(v1, v2);
                minSum = Math.min(v1, v3);
            }
            
            int AmaxSum = Math.abs(maxSum);
            int AminSum = Math.abs(minSum);

            res = Math.max(res, Math.max(AmaxSum, AminSum));
        }
        return res;
    }
}