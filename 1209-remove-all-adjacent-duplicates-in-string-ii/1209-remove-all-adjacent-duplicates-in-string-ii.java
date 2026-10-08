class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();

        Stack<int[]> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(st.isEmpty()){
                st.push(new int[]{c, 1});
                continue;
            }
            if(st.peek()[0] != c){
                st.push(new int[]{c, 1});
                continue;
            }

            int[] p = st.peek();

            if(p[1] < k - 1){
                p[1]++;
            }else{
                st.pop();
            }
        }

        while(!st.isEmpty()){
            int[] p = st.pop();

            for(int i=0; i<p[1]; i++){
                res.append((char)p[0]);
            }
        }
        return res.reverse().toString();
    }
}