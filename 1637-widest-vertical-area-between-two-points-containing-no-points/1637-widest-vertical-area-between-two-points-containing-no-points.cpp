class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        int n = points.size();
        vector<int> temp;

        for(int i=0; i<n; i++){
            temp.push_back(points[i][0]);
        }
        sort(temp.begin(), temp.end());
        
        int result = 0;

        for(int i=1; i<n; i++){
            result = max(result, temp[i]-temp[i-1]);
        }

        return result;
    }
};