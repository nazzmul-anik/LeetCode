class Solution {

    public int max(int a, int b){
        if(a>b) return a;
        return b;
    }

    public int maxScore(String s) {
        
        int n = s.length();
        int one = 0, zero = 0;
        int maxScore = 0;
        for(int i=0; i<n; i++) if(s.charAt(i)=='1') one++;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)=='1') one--;
            else zero ++;
            maxScore = max(maxScore, zero+one);
        }
        return maxScore;
    }
}