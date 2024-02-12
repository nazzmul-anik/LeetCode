class Solution {
public:

    int lowerBound(vector<int>&contains, int target){
        int ans = contains.size();
        int low=0, high=ans-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(contains[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    int lengthOfLIS(vector<int>& nums) {
        
        vector<int> contains;
        contains.push_back(nums[0]);
        int length = 1;
        for(int i=1; i<nums.size(); i++){

            if(nums[i] > contains.back()){
                contains.push_back(nums[i]);
                length++;
            }else{
                int ind = lowerBound(contains, nums[i]);
                contains[ind] = nums[i];
            }
        }

        return length;
    }
};