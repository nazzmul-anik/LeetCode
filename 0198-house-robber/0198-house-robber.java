class Solution {

    public static int solve(int ind, int[] nums, int[] dp){
        if(ind<0) return 0;
        if(ind==0) return nums[0];

        if(dp[ind] != -1) return dp[ind];

        int notTake = 0 + solve(ind-1, nums, dp);
        int take = nums[ind] + solve(ind-2, nums, dp);

        dp[ind] = Math.max(take, notTake);

        return dp[ind];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(n-1, nums, dp);
    }
}