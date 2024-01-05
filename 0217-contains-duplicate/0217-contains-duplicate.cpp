class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> mp;
        for(auto num : nums){
            
            if(mp[num]>=1) return true;

            mp[num]++;
        }
    
        return false;
    }
};