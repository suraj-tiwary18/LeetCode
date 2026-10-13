class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<operations.length; i++){
            String s = operations[i];

            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int d = st.peek() * 2;
                st.push(d);
            }else if(s.equals("+")){
                int a = st.get(st.size() - 1);
                int b = st.get(st.size() - 2);
                int c = a + b;
                st.push(c);
            }else{
                int num = Integer.parseInt(s);
                st.push(num);
            }

        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}