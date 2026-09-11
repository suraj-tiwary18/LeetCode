class Solution {
    public int maximumSum(int[] arr) {
        int res = arr[0];
        int nodeletion = arr[0];
        int onedeletion = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=1; i<n; i++){

            int prevnodeletion = nodeletion;
            int prevonedeletion = onedeletion;

            int s = arr[i];
            int u = nodeletion + arr[i];
            nodeletion = Math.max(s, u);

            int v1 = Integer.MIN_VALUE;
            if(prevonedeletion == Integer.MIN_VALUE){
                v1 = arr[i];
            } else {
                v1 = prevonedeletion + arr[i];
            }

            onedeletion = Math.max(v1, prevnodeletion);

            res = Math.max(res, Math.max(nodeletion, onedeletion));
        }
        return res;
    }
}


// Time complexity = O(n)
// Space Complexity = O(1)