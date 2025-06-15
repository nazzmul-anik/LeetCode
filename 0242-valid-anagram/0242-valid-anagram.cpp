class Solution {
public:
    bool isAnagram(string s, string t) {
        
        vector<int> cont1(26, 0);
        vector<int> cont2(26, 0);

        if(s.size() != t.size()){
            return false;
        }

        for(int i=0; i<s.size(); i++){
            int num1 = s[i]-'a';
            int num2 = t[i]-'a';

            cont1[num1]++;
            cont2[num2]++;
        }

        for(int i=0; i<26; i++){
            if(cont1[i] != cont2[i]){
                return false;
            }
        }

        return true;
    }
};