class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        arr[n-1] = -1;

        st.push(nums[n-1]);

        for(int i=2*n-2; i>=0; i--){
            int index = i % n;
            while(!st.isEmpty() && st.peek() <= nums[index]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[index] = -1;
            } else {
                arr[index] = st.peek();
            }
            st.push(nums[index]);
        }
        return arr;
    }
}