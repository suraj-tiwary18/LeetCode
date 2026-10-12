class Solution {
    public int removeElement(int[] nums, int val) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                st.push(nums[i]);
            } 
        }
        int k = st.size(); 

        for(int i=0; i<k; i++){
            nums[i] = st.get(i);
        }

        return k;
    }
}