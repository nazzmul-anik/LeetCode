class Solution {
    public void rotate(int[] nums, int k) {
        
        int arrayLength = nums.length;
        int[] ans = new int[arrayLength];
        for(int index=0; index<arrayLength; index++){
            ans[(index+k)%arrayLength] = nums[index];
        }

        for(int i=0; i<arrayLength; i++){
            nums[i] = ans[i];
        }

    }
}