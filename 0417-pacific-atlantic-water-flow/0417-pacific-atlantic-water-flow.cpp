class Solution {
public:

    void dfs(int row, int col, int n, int m, vector<vector<int>>& vis,
             vector<vector<int>>& heights) {
        vis[row][col] = 1;
        // up
        if (row > 0 && vis[row - 1][col] == 0 &&
            heights[row - 1][col] >= heights[row][col]) {
            dfs(row - 1, col, n, m, vis, heights);
        }
        // down
        if (row < n - 1 && vis[row + 1][col] == 0 &&
            heights[row + 1][col] >= heights[row][col]) {
            dfs(row + 1, col, n, m, vis, heights);
        }
        // left
        if (col > 0 && vis[row][col - 1] == 0 && heights[row][col - 1] >= heights[row][col]) {
            dfs(row, col - 1, n, m, vis, heights);
        }
        // right
        if (col < m-1 && vis[row][col + 1] == 0 && heights[row][col + 1] >= heights[row][col]) {
            dfs(row, col + 1, n, m, vis, heights);
        }
    }

    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
        int row = heights.size();
        int col = heights[0].size();
        vector<vector<int>> pacific(row, vector<int>(col, 0));
        vector<vector<int>> atlantic(row, vector<int>(col, 0));

        // for top to bottom
        for (int i = 0; i < row; i++) {
            dfs(i, 0, row, col, pacific, heights);
            dfs(i, col - 1, row, col, atlantic, heights);
        }
        // for left to right
        for (int i = 0; i < col; i++) {
            dfs(0, i, row, col, pacific, heights);
            dfs(row - 1, i, row, col, atlantic, heights);
        }

        vector<vector<int>> ans;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.push_back({i,j});
                }
            }
        }

        return ans;
    }
};