class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> f = new HashMap<>();
        f.put(0, -1);

        for(int i=0; i<n; i++){
            sum += nums[i];

            int rem = sum % k;
            if(f.containsKey(rem)){
                int idx = f.get(rem);

                if(i - idx >= 2){
                    return true;
                }

            }else{
                f.put(rem, i);
            }
        }
        return false;
    }
}