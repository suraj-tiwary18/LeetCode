class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int n = s.length();
        int res = 0;

        Map<Character, Integer> lastIndex = new HashMap<>();
        for(int right = 0; right < n; right++){
            char c = s.charAt(right);

            if(lastIndex.containsKey(c)){
            left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}