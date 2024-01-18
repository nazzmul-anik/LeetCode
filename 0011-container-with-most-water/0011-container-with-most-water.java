class Solution {

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public int maxArea(int[] height) {
        
        int n = height.length;
        int low = 0, high = n-1;
        int max = 0;

        while(low<high){
            int contains = Math.min(height[low], height[high]) * (high-low);
            max = Math.max(contains, max);

            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }

        return max;
    }
}