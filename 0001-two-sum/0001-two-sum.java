class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int need;
        for(int i=0; i<n; i++){
            need = target - nums[i];
            if(map.containsKey(need)){
                ans[0] = map.get(need);
                ans[1] = i;
                return ans;
            }

            map.put(nums[i], i);
        }

        return ans;
    }
}