class Solution {
    public int getSum(int a, int b) {
        
        while(b!=0){
            int prevA = a;
            a = a ^ b;
            b = (prevA & b) << 1;
        }

        return a;
    }
}