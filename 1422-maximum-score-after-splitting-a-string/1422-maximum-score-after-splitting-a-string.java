class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zero = new int[n];
        int[] one = new int[n];
        boolean minimumOne_1 = false;
        boolean minimumOne_0 = false;

        for(int i=0; i<n; i++){
            if(i==0 && s.charAt(i)=='0'){
                zero[i] = 1;
                minimumOne_0 = true;
            }
            else if(s.charAt(i)=='0'){
                zero[i] = zero[i-1] + 1;
                minimumOne_0 = true;
            }else if(i>0){
                zero[i] = zero[i-1];
            }
        }

        for(int i=n-1; i>=0; i--){
            if(i==n-1 && s.charAt(i)=='1'){
                one[i] = 1;
                minimumOne_1 = true;
            }
            else if(s.charAt(i)=='1'){
                one[i] = one[i+1] + 1;
                minimumOne_1 = true;
            }else if(i<n-1){
                one[i] = one[i+1];
            }
        }

        int maxSum = 0;
        int sum;
        for(int i=0; i<n; i++){
            sum = zero[i] + one[i];
            System.out.print(sum + " ");
            if(sum>maxSum){
                maxSum = sum;
            }
        }

        if(minimumOne_0 == false || minimumOne_1 == false){
            return maxSum - 1;
        }

        return maxSum;
    }
}