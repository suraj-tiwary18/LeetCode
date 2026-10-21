class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int n = ransomNote.length();
        int m = magazine.length();

        for(int i=0; i<n; i++){
            need.put(ransomNote.charAt(i), need.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for(int i=0; i<m; i++){
            have.put(magazine.charAt(i), have.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        return fun(have, need);
    }

    boolean fun(HashMap<Character, Integer> have, HashMap<Character, Integer> need){
        for(Map.Entry<Character, Integer> i : need.entrySet()){
            char c = i.getKey();
            int fneed = i.getValue();
            int fhave = have.getOrDefault(c, 0);
            if(fhave < fneed){
                return false;
            }
        }
        return true;
    }

}