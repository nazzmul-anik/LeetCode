class Solution {
public:
    bool isPathCrossing(string path) {
        set<pair<int, int>> st;
        int row=0, col=0;
        st.insert({row, col});
        int n = path.size();

        for(int i=0; i<n; i++){
            if(path[i] == 'N') row++;
            else if(path[i] == 'E') col++;
            else if(path[i] == 'W') col--;
            else if(path[i] == 'S') row--;

            if(st.find({row, col}) != st.end()) return true;
            st.insert({row, col});
        }

        return false;
    }
};