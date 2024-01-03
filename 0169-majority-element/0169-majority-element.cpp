class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        // Using Hashing
        map<int, int> mp;
        for(int num: nums){
            mp[num]++;
        }

        int major=0;
        int n = nums.size();

        for(auto it : mp){
            if(it.second > n/2){
                return it.first;
            }
        }

        return -1;
    }
};