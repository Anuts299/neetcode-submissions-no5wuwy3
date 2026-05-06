class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for ( int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer j = map.get(complement);
            if (j != null){
                return new int[]{j,i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}