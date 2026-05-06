class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int i = 0; int j = 0;
    //    for (i = 0; i < nums.length; i++) {
    //         int x = target - nums[i];
    //         for (j = 0; j < nums.length; j++) {
    //             if (nums[j] == x && i != j) {
    //                 if (i < j){
    //                     return new int[]{i,j};
    //                 } else {
    //                     return new int[]{j,i};
    //                 }
    //             }
    //         }
    //    }
    //    return new int[]{i,j};
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for ( int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)){
                int j = map.get(complement);
                return new int[]{Math.min(j, i), Math.max(j, i)};

            }
            map.put(nums[i], i);
            
        }
        return new int[]{0,0};
    }
}