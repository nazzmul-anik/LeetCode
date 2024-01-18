class Solution {
    public int majorityElement(int[] nums) {
        // O(n) time complexicity
        int element = 0, count=0;

        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count++;
            }
            else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }

        return element;
    }
}