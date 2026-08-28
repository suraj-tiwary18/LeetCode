class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k <= 1){
            return 0;
        }

        int low = 0;
        int res = 0;
        int product = 1;
        int n = nums.length;

        for(int high=0; high<n; high++){

            product = product * nums[high];

            if(product < k){
                int len = high - low + 1;
                res = res + len;
            }

            while(product >= k){
                product = product / nums[low];
                low++;

                if(product < k){
                    int len = high - low + 1;
                    res = res + len;
                }
            }
        }
        return res;
    }
}