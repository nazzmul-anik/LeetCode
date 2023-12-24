class Solution {
    public int[] numberGame(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.sort(nums);
        
        int i, j=1, k=0;
        for(i=0; i<n/2; i++){
            
            ans[k] = nums[j];
            k=k+1;
            ans[k] = nums[j-1];
            k=k+1;
            j=j+2;
        }
        
        return ans;
    }
}