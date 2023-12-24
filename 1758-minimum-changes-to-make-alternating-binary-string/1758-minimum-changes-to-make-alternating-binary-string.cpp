class Solution {
public:
    int minOperations(string s) {
        int n = s.size();
        string s1="", s2="";

        for(int i=0; i<n; i++){
            if(i&1){
                s1=s1+'0';
                s2=s2+'1';
            }else{
                s1=s1+'1';
                s2=s2+'0';
            }
        }

        int count1=0, count2=0;
        for(int i=0; i<n; i++){
            if(s1[i] != s[i]) count1++;
            if(s2[i] != s[i]) count2++;
        }

        return min(count1, count2);
    }
};