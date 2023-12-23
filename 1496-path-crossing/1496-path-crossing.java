class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet();
        int row=0, col=0;
        set.add(row+","+col);

        for(char c: path.toCharArray()){
            if(c == 'N') row++;
            else if(c == 'E') col++;
            else if(c == 'W') col--;
            else if(c == 'S') row--;

            String p = row+","+col;
            if(set.contains(p)) return true;
            set.add(p);
        }
        return false;
    }
}