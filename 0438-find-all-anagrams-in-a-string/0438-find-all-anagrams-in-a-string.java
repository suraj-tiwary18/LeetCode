class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int low = 0;
        int high = 0; 
        int sl = s.length();
        int pl = p.length();

        List<Integer> result = new ArrayList<>();

        int[] arrs = new int[26];
        int[] arrp = new int[26];

        for(int i=0; i<pl; i++){
            arrp[p.charAt(i) - 'a']++;
        }

        for(high=0; high<sl; high++){
            arrs[s.charAt(high) - 'a']++;

            int len = high - low + 1;

            if(len > pl){
                arrs[s.charAt(low) - 'a']--;
                low++;
            }

            if(Arrays.equals(arrs, arrp)){
                result.add(low);
            }
        }
        return result;
    }
}