class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int res = nums[0];

        int min = nums[0];

        int ArraySum = 0;
        for(int j=0; j<n; j++){
            ArraySum = ArraySum + nums[j];
        }

        for(int i=1; i<n; i++){
            int v1 = nums[i];
            int v2 = maxSum + nums[i];
            int v3 = minSum + nums[i];

            maxSum = Math.max(v1, v2);
            minSum = Math.min(v1, v3);

            min = Math.min(min, minSum);

            int A1 = ArraySum - min;

            if(min != ArraySum){
                res = Math.max(res, Math.max(A1, maxSum));
            } else {
                res = Math.max(res, maxSum);
            }
        }

        if(res < 0){
            return res;
        }

        return res;
    }
}