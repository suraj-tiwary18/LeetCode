class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        for(Map.Entry<Character, Integer> i : map.entrySet()){
            int val = i.getValue();
            if(val % 2 == 0){
                res += val;
            }else{
                odd = true;
            }
        }

        if(odd == false){
            return res;
        }

        for(Map.Entry<Character, Integer> i : map.entrySet()){
            int val = i.getValue();
            if(val % 2 == 1){
                res += val-1;
            }
        }
        return res+1;
    }
}