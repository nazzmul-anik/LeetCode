class Solution {

    public static int totalOne(int n){
        int one=0;
        while(n>0){
            one++;
            n = n & (n-1);
        }
        return one;
    }

    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i] = totalOne(i);
        }

        return ans;
    }
}