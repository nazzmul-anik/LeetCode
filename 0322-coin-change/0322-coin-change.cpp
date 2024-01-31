class Solution {
public:

    const int large = 1e8;
    int solve(int ind, int target, vector<int>&coins, vector<vector<int>>&dp){
        if(ind == 0){
            if(target % coins[ind] == 0){
               return target/coins[ind];
            }else{
                return large;
            }
        }

        if(dp[ind][target] != -1) return dp[ind][target];

        int notTake = 0 + solve(ind-1, target, coins, dp);
        int take = large;
        if(coins[ind] <= target){
            take = 1 + solve(ind, target - coins[ind], coins, dp);
        }

        return dp[ind][target] = min(take, notTake);
    }

    int coinChange(vector<int>& coins, int amount) {
        
        int n = coins.size();
        vector<vector<int>> dp(n, vector<int>(amount+1, -1));

        int ans = solve(n-1, amount, coins, dp);

        if(ans>=large) return -1;
        return ans;
    }
};