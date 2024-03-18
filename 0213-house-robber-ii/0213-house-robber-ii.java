class Solution {

    public static int solve(int ind, List<Integer> num, int[] dp){
        if(ind < 0) return 0;
        if(ind == 0){
            return num.get(ind);
        }

        if(dp[ind] != -1) return dp[ind];

        int notTake = 0 + solve(ind-1, num, dp);
        int take = num.get(ind) + solve(ind-2, num, dp);

        dp[ind] = Math.max(take, notTake);

        return dp[ind];
    }

    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==1) return nums[0];
        List<Integer> num1 = new ArrayList<Integer>();
        List<Integer> num2 = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            if(i!=0) num1.add(nums[i]);
            if(i!= (n-1)) num2.add(nums[i]);
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int first = solve(n-2, num1, dp);
        Arrays.fill(dp, -1);

        int last = solve(n-2, num2, dp);

        return Math.max(first, last);
    }
}