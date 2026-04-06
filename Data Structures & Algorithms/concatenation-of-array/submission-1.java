class Solution {
    public int[] getConcatenation(int[] nums) {
        // int n = nums.length;

        // int[] ans = new int[n*2];
        // System.arraycopy(nums, 0, ans, 0, n);
        // System.arraycopy(nums, 0, ans, n, n);
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}