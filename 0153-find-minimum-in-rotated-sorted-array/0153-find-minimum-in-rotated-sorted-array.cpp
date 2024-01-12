class Solution {
public:
    int findMin(vector<int>& nums) {
        
        int n = nums.size();
        if(n == 1) return nums[0];
        
        if(nums[0] < nums[n-1]) return nums[0];
        
        int low=0, high=n-1;
        int mid, ans=1e9;
        
        while(low<=high){
            mid = low + (high-low)/2;
            if(nums[low] <= nums[mid]){
                ans = min(ans, nums[low]);
                low=mid+1;
            }else{
                ans = min(ans, nums[mid]);
                high = mid-1;
            }
        }
        
        return ans;
    }
};