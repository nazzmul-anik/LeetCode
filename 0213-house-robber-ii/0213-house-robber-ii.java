class Solution {

    public static int solve(Integer ind, List<Integer> nums, Integer[] dp){
        if(ind<0) return 0;
        if(ind == 0) return dp[ind] = nums.get(ind);

        if(dp[ind] != null) return dp[ind];

        int notTake = 0 + solve(ind-1, nums, dp);
        int take = nums.get(ind) + solve (ind-2, nums, dp);

        return dp[ind] = Math.max(take, notTake);
    }

    public int rob(int[] nums) {
        
        int n = nums.length;

        if(n==1) return nums[0];

        List<Integer> num1 = new ArrayList<Integer>();
        List<Integer> num2 = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            if(i!=0){
                num1.add(nums[i]);
            }
            if(i != (n-1)){
                num2.add(nums[i]);
            }
        }

        Integer dp[] = new Integer[n];
        Arrays.fill(dp, null);

        int leaveFirst = solve(n-2, num1, dp);
        
        Arrays.fill(dp, null);
        int leaveLast = solve(n-2, num2, dp);

        return Math.max(leaveFirst, leaveLast);
    }
}