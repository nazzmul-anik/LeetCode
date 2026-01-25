class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);
        
        for(int i=1; i<numRows; i++){
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=0; j<prev.size(); j++){
                if(j+1 < prev.size()){
                    curr.add(prev.get(j) + prev.get(j+1));
                }
            }
            curr.add(1);
            ans.add(curr);
        }

        return ans;
    }
}