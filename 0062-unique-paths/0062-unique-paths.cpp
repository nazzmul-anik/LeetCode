class Solution {
public:

    int solve(int r, int c, int m, int n, vector<vector<int>> &dp){
        if(r==m || c == n) return 0;
        if(r == m-1 && c == n-1){
            return dp[r][c]=1;
        }

        if(dp[r][c] != -1) return dp[r][c];

        return dp[r][c] = solve(r+1, c, m, n, dp) + solve(r,c+1, m, n, dp);
    }

    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m+1, vector<int> (n+1, -1));
        return solve(0, 0, m, n, dp);
    }
};