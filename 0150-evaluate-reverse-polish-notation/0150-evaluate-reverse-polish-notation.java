class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String s = tokens[i];

            if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();
                int ans = a + b;
                st.push(ans); 
            }else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                int ans = a - b;
                st.push(ans);                
            }else if(s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                int ans = a * b;
                st.push(ans);                
            }else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int ans = a / b;
                st.push(ans);                
            }else{
                int num = Integer.parseInt(s);
                st.push(num);
            }
        }

        return st.pop();

    }
}