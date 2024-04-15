class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        
        vector<int> adj[numCourses];
        // i == index
        for(int i=0; i<prerequisites.size(); i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];
            adj[u].push_back(v);
        }

        vector<int> indegree(numCourses, 0);

        for(int node=0; node < numCourses; node++){
            for(int edge: adj[node]){
                indegree[edge]++;
            }
        }
        queue<int> q;
        for(int node=0; node <numCourses; node++){
            if(indegree[node] == 0) q.push(node);
        }
        int totalNode = 0;

        while(!q.empty()){
            int node = q.front();
            q.pop();
            totalNode++;

            for(int edge : adj[node]){
                indegree[edge]--;
                if(indegree[edge] == 0) q.push(edge);
            }
        }

        return totalNode == numCourses;
    }
};