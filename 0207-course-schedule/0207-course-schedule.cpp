class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        
        int n = numCourses;
        vector<int> indegree(n+1, 0);
        vector<int> adj[n+1];

        for(auto it : prerequisites){
            int u = it[0];
            int v = it[1];

            adj[v].push_back(u);
        }

        queue<int> q;
        for(int i=0; i<n; i++){
            for(int j : adj[i]){
                indegree[j]++;
            }
        }

        for(int i=0; i<n; i++){
            if(indegree[i] == 0) q.push(i);
        }

        int totalNode = 0;

        while(!q.empty()){
            int node = q.front();
            q.pop();

            totalNode++;

            for(int newNode : adj[node]){

                indegree[newNode]--;
                if(indegree[newNode] == 0) q.push(newNode);
            }
        }

        if(totalNode == n) return true;
        return false;
    }
};