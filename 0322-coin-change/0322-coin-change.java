class Solution {
    public static int large = (int)Math.pow(10, 9);

    public static int solve(int ind, int target, int[] coins, int[][] dp){
        if(ind == 0){
            if(target % coins[ind] == 0){
                return target/coins[ind];
            }else{
                return large;
            }
        }

        if(dp[ind][target] != -1){
            return dp[ind][target];
        }

        int notTake = 0 + solve(ind-1, target, coins, dp);
        int take = large;
        if(coins[ind] <= target){
            take = 1 + solve(ind, target - coins[ind], coins, dp);
        }

        return dp[ind][target] = Math.min(take, notTake);
    }

    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int[][] dp = new int[n][amount+1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        int ans = solve(n-1, amount, coins, dp);

        if(ans>=large) return -1;
        return ans;
    }
}