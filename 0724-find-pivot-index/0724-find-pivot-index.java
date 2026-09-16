class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;

        int sum = 0;
        for(int j=0; j<n; j++){
            sum = sum + nums[j];
        }

        if(sum - nums[0] == 0){
            return 0;
        }

        for(int i=1; i<n; i++){
            left += nums[i-1];
            right = sum - nums[i] - left; 

            if(left == right){
                return i;
            }
        }
        return -1;
    }
}