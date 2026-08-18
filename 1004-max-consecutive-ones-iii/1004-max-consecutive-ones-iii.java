class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int n = nums.length;
        int info = 0;
        int result = 0;

        for(high=0; high<n; high++){
            
            if(nums[high] == 0){
                info++;
            }

            while(info > k){
                if(nums[low] == 0){
                    info--;
                }
                low++;
            }

            int len = high - low + 1;
            result = Math.max(result, len);
        }
        return result;
    }
}