class Solution {

    public static int solve(int target, int[] nums, int[] dp){
        if(target < 0) return 0;
        if(target == 0) return 1;
        if(dp[target] != -1) return dp[target];

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + solve(target-nums[i], nums, dp);
        }

        return dp[target] = sum;
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        for(int i=0; i<=target; i++){
            dp[i] = -1;
        }

        return solve(target, nums, dp);
    }
}