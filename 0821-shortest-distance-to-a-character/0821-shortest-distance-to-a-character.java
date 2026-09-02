class Solution {
    public int[] shortestToChar(String s, char c) {
        int sl = s.length();
        int[] answer = new int[s.length()];

        for(int i=0; i<sl; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<sl; j++){
                if(s.charAt(j) == c){
                    int distance = Math.abs(i - j);
                    min = Math.min(min, distance);
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}