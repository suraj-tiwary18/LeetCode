class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int low = 0; 
        int high = 0; 
        int n = s1.length();
        int m = s2.length();

        if(n > m){
            return false;
        }

        int[] arrs1 = new int[26];
        int[] arrs2 = new int[26];

        for(int i=0; i<n; i++){
            arrs1[s1.charAt(i) - 'a']++;
        }

        for(high=0; high<m; high++){
            arrs2[s2.charAt(high) - 'a']++;

            int len = high - low + 1;

            if(len > n){
                arrs2[s2.charAt(low) - 'a']--;
                low++;
            }

            if(Arrays.equals(arrs1, arrs2)){
                return true;
            }
        }
        return false;

    }
}