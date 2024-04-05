class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n-1;
        int max = 0;
        for(int i=0; i<n; i++){
            if(max < i) return false;
            max = Math.max(i+nums[i], max);
            if(max >= target) return true;
        }
        return true;
    }
}