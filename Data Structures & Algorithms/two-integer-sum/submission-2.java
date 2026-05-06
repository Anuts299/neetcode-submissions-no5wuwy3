class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0; int j =0;
       for (i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            for (j = 0; j < nums.length; j++) {
                if (nums[j] == x && i != j) {
                    if (i < j){
                        return new int[]{i,j};
                    } else {
                        return new int[]{j,i};
                    }
                }
            }
       }
       return new int[]{i,j};
    }
}
