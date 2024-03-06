class Solution {

    int solve(int n, int target, int[] nums, int[] dp){
        if(target == 0) return 1;
        if(target < 0) return 0;

        if(dp[target] != -1) return dp[target];

        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + solve(n, target - nums[i], nums, dp);
        }
        return dp[target] = sum;
    }

    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target+1];
        for(int i=0; i<=target; i++){
            dp[i] = -1;
        }
        return solve(n, target, nums, dp);
    }
}