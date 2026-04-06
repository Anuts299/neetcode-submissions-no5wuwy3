class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.add(a) != true) return true;
        }
        return false;
        
    }
}