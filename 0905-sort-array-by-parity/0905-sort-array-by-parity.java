class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while(left <= right){
            if(nums[left] % 2 == 0){
                left++;
            } else if (nums[right] % 2 == 1){
                right--;
            } else if (nums[left] % 2 != 0 && nums[right] % 2 != 1){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            } else {
                left++;
                right--;
            }
        }
        return nums;
    }
}