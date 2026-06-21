class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char d:t.toCharArray()){
            if(!map.containsKey(d)){
                return false;
            }
            map.put(d, map.get(d)-1);
            if(map.get(d)==0){
                map.remove(d);
            }
        }
        return map.isEmpty();
    }
}
