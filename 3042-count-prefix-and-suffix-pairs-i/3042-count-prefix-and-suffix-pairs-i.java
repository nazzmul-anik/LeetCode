class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        
        int count = 0;
        int n = words.length;
        
        for(int i=0; i<n-1; i++){
            String str1 = words[i];
            int len1 = str1.length();
            for(int j=i+1; j<n; j++){
                String str2 = words[j];
                
                int len2 = str2.length();
                
                if(len1<=len2){
                    
                    if(str2.substring(0, len1).equals(str1) && str2.substring(len2-len1, len2).equals(str1)){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}