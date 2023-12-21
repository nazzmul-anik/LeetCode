class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int n = points.length;
        int[] temp = new int[n];

        for(int i=0; i<n; i++){
            temp[i] = points[i][0];
        }
        Arrays.sort(temp);
        int result = 0;

        for(int i=1; i<n; i++){
            result = Math.max(result, temp[i]-temp[i-1]);
        }

        return result;
    }
}