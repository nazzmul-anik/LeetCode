class Solution {

    public static int lowerBound(int target, ArrayList<Integer> al){
        int ans=al.size();
        int low = 0, high = al.size()-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(al.get(mid) >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int ans=1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(nums[0]);

        for(int i=1; i<n; i++){
            if(nums[i] > al.get(al.size()-1)){
                al.add(nums[i]);
                ans++;
            }else{
                int ind = lowerBound(nums[i], al);
                al.set(ind, nums[i]);
            }
        }

        return ans;
    }
}