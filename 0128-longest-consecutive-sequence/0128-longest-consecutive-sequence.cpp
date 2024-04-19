class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        
        int n = nums.size();
        if(n==0 || n==1) return n;
        sort(nums.begin(), nums.end());

        int len=1;
        int maxLen=1;
        int last = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] == last) continue;
            else if(nums[i] == (last+1)){
                len++;
                maxLen = max(len, maxLen);
            }else{
                len = 1;
            }
            last = nums[i];
        }

        return maxLen;
    }
};