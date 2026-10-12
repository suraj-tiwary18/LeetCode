class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();

        int[] freq = new int[26];
        boolean[] seen = new boolean[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = ch - 'a';

            freq[index]--;

            if(seen[index]){
                continue;
            }

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                char removed = st.pop();
                seen[removed - 'a'] = false;
            }

            st.push(ch);
            seen[index] = true;

        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<st.size(); i++){
            sb.append(st.get(i));
        }

        return sb.toString();

    }
}