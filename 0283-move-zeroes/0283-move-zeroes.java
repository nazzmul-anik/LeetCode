class Solution {

    public void Swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    Swap(i, j, nums);
                    break;
                }
            }
        }

    }
}