class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                
                int len = j - i + 1;

                if(len%2 != 0){
                    res += sum; 
                }
            }
        }
        return res;
    }
}