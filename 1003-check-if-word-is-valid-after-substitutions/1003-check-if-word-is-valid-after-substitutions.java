class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));

            if(st.size() >= 3 &&
            st.get(st.size() - 3) == 'a' &&
            st.get(st.size() - 2) == 'b' &&
            st.peek() == 'c'){

                st.pop();
                st.pop();
                st.pop();
            }
        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
}