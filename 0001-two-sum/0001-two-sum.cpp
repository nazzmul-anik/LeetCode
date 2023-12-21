class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        int n = nums.size();
        map<int, int> mp;
        int need;
        for(int i=0; i<n; i++){
            need = target-nums[i];
            if(mp.find(need) != mp.end()){
                return {i, mp[need]};
            }
            mp[nums[i]] = i;
        }

        return {};
    }
};