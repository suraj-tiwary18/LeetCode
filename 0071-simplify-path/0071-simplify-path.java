class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");

        for(int i=0; i<arr.length; i++){
            String s = arr[i];

            if(s.equals("") || s.equals(".")){
                continue;
            }

            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }

            else {
                st.push(s);
            }   
        }

        String res = "";

        while(!st.isEmpty()){
            res = "/" + st.pop() + res;
        }

        if(res.equals("")){
            return "/";
        }


        return res;
    }
}