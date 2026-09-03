class Solution {

    public boolean isVowel(char ch){
        return  ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); 
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left<right){
            if(!isVowel(arr[left])){
                left++;
                continue;
            }

            if(!isVowel(arr[right])){
                right--;
                continue;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        return new String(arr);
    }
}