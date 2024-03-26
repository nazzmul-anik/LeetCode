class Solution {

    public static int solve(int i, int n, String s, int[] dp){
        if(i==n) return 1;
        if(dp[i] != -1) return dp[i];

        int op1=0, op2=0, ans = 0;
        op1 = s.charAt(i)-'0';
        if(op1 > 0){
            ans = ans + solve(i+1, n, s, dp);
        }
        if(i<n-1){
            op2 = op1 * 10 + s.charAt(i+1) - '0';
        }
        if(op2>9 && op2<=26){
            ans = ans + solve(i+2, n, s, dp);
        }

        return dp[i] = ans;
    }

    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, n, s, dp);
    }
}