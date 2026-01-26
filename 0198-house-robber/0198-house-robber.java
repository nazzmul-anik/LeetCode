class Solution {

    int maxCount(int[] nums, int ind, int[] dp){
        if(ind == 0) return nums[ind];
        if(ind < 0) return 0;

        if(dp[ind] != -1) return dp[ind];

        int take = nums[ind] + maxCount(nums, ind-2, dp);
        int notTake = 0 + maxCount(nums, ind-1, dp);

        return dp[ind] = Math.max(take, notTake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return maxCount(nums, n-1, dp);
    }
}