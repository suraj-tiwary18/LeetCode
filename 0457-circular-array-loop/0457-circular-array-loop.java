class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){

            int slow = i;
            int fast = i;

            while(true){
                int slowNext = (slow + nums[slow]) % n;
                if(slowNext < 0){
                    slowNext += n;
                }

                int fastNext = (fast + nums[fast]) % n;
                if(fastNext < 0){
                    fastNext += n;
                }

                int fastNextNext = (fastNext + nums[fastNext]) % n;
                if(fastNextNext < 0){
                    fastNextNext += n;
                }

                if (nums[slow] * nums[slowNext] < 0 ||
                    nums[fast] * nums[fastNext] < 0 ||
                    nums[fastNext] * nums[fastNextNext] < 0) {
                    break;
                }

                slow = slowNext;
                fast = fastNextNext;

                if(slow == fast){
                    if(slow == (slow + nums[slow] % n + n) % n){
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}