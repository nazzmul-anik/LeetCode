class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int result = 0;
        int n = gain.length;
        for(int i=1; i<n; i++){
            sum = sum + gain[i-1];
            result = Math.max(result, sum);
        }
        result = Math.max(result, sum+gain[n-1]);
        return result;
    }
}