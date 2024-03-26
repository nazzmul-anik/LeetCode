class Solution {
public:
    int solve(int i, int n, string &s, int *dp){
        if(i==n) return 1;
        if(dp[i] != -1) return dp[i];
        
        int opt1=0, opt2=0, ans=0;
        opt1 = s[i]-'0';
        if(opt1>0){
            ans = ans + solve(i+1, n, s, dp);
        }
        if(i<n-1){
            opt2 = opt1*10+s[i+1]-'0';
        }
        if(opt2>9&&opt2<=26){
            ans = ans + solve(i+2, n, s, dp);
        }

        return dp[i] = ans;
    }

    int numDecodings(string s) {
        int n = s.size();
        int dp[n+1];
        memset(dp, -1, sizeof(dp));
        return solve(0, n, s, dp);
    }
};