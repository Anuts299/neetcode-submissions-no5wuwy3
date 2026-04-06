class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for( int i : nums) {
            if(!check.add(i)){
                return true;
            }
        }
        return false;
    }
}