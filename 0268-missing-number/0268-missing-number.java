class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int Xor = 0;
        for(int i=0; i<=n; i++){
            Xor = Xor ^ i;
        }
        for(int i=0; i<n; i++){
            Xor = Xor ^ nums[i];
        }

        return Xor;
    }
}