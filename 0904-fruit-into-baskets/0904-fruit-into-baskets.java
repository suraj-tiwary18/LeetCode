class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int n = fruits.length;
        int res = 0;

        HashMap<Integer, Integer> f = new HashMap<>();
        for(high = 0; high < n; high++){
            f.put(fruits[high], f.getOrDefault(fruits[high], 0) + 1);

            while(f.size() > 2){
                int lowFruit = fruits[low];
                f.put(lowFruit, f.get(lowFruit)-1);
                if(f.get(lowFruit)==0)
                    f.remove(lowFruit);
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}