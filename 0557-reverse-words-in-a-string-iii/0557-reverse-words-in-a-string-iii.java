class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        
        int n = arr.length;
        int low = 0;
        int high = 0;
        int placeH = 0;

        while(high < n){

            if(arr[high] != ' '){
                high++;
            }
            else {
                placeH = high;
                high--;

                while(low < high){
                    char temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;

                    low++;
                    high--;
                }

                low = placeH + 1;
                high = low;
            }
        }

        high = n - 1;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return new String(arr);
    }
}