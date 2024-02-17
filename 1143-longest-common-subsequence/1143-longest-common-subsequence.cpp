class Solution {
public:

    int solve(int n, int m, string &text1, string &text2, vector<vector<int>>&dp){

        if(n<0 || m<0) return 0;

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        int ans=0;
        if(text1[n] == text2[m]){
            ans = 1 + solve(n-1, m-1, text1, text2, dp);
        }else{
            ans = 0 + max(solve(n-1, m, text1, text2, dp), solve(n, m-1, text1, text2, dp));
        }

        return dp[n][m] = ans;
    }

    int longestCommonSubsequence(string text1, string text2) {
        
        int n = text1.size();
        int m = text2.size();

        vector<vector<int>> dp(n, vector<int>(m, -1));

        int ans = solve(n-1, m-1, text1, text2, dp);

        return ans;
    }
};