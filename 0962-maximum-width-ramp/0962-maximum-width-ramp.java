class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<>();

        int maxWidth = 0;

        for(int i=0; i<nums.length; i++){
            if(st.isEmpty() || nums[i] < nums[st.peek()]){
                st.push(i);
            }
        }

        for(int j=nums.length-1; j>=0; j--){
            while(!st.isEmpty() && nums[j] >= nums[st.peek()]){
                int i = st.peek();

                int width = j-i;
                if(width > maxWidth){
                    maxWidth = width;
                }
                st.pop();
            }
        }
        return maxWidth;
    }
}