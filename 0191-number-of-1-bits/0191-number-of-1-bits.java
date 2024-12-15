class Solution {
    public int hammingWeight(int n) {
        
        int numberOfBits = 0;
        while(n>0){
            n = n & (n-1);
            numberOfBits++;
        }
        return numberOfBits;
    }
}