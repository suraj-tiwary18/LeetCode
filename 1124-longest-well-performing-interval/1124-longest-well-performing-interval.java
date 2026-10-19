class Solution {
    public int longestWPI(int[] hours) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<hours.length; i++){
            if(hours[i] > 8){
                sum += 1;
            }else{
                sum -= 1;
            }
            
            if(sum > 0){
                maxLength = i + 1;
            }else if(map.containsKey(sum - 1)){
                maxLength = Math.max(maxLength, i - map.get(sum - 1));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}