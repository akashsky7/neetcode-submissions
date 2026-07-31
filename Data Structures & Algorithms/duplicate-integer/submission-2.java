class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Number> set = new HashSet<>();

        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}