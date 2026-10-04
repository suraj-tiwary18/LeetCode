class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        String res = "";

        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            res = res + st.peek();
            st.pop();
        }
        StringBuilder ans = new StringBuilder(res);
        ans.reverse();
        return ans.toString();
    }
}