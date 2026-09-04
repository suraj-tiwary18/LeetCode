class Solution {
    public String reverseOnlyLetters(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            while(left<right && !Character.isLetter(cs[left])){
                left++;
            }
            while(left<right && !Character.isLetter(cs[right])){
                right--;
            }
            if(left < right){
                char temp = cs[left];
                cs[left] = cs[right];
                cs[right] = temp;
                left++;
                right--;
            }
        }
        return new String(cs);
    }
}