class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
            for(char c:s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int ct:count){
                key.append(ct).append('#');
            }
            String finalKey = key.toString();
            if(!map.containsKey(finalKey)){
                map.put(finalKey, new ArrayList<String>());
            }
                map.get(finalKey).add(s);
            
        }
        return new ArrayList(map.values());
    }
}