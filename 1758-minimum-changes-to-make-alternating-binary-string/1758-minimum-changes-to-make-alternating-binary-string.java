class Solution {
    public int minOperations(String s) {
        
        int n = s.length();
        String s1="", s2="";
        for(int i=0; i<n; i++){
            if((i&1) == 0){
                s1=s1+"0";
                s2=s2+"1";
            }else{
                s1=s1+"1";
                s2=s2+"0";
            }
        }

        int count1=0, count2=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) != s1.charAt(i)) count1++;
            if(s.charAt(i) != s2.charAt(i)) count2++;
        }

        return Math.min(count1, count2);
    }
}