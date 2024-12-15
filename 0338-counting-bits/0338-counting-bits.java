class Solution {

    public static int numberOfBits(int n){
        int bits = 0;
        while(n>0){
            n = n & (n-1);
            bits++;
        }
        return bits;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i] = numberOfBits(i);
        }
        return ans;
    }
}