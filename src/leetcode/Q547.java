package leetcode;

import java.util.ArrayList;

public class Q547 {
    public static void main(String[] args) {
        int[][] isConnected = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        System.out.println(findCircleNum(isConnected));
    }

    public static ArrayList<ArrayList<Integer>> convert(int[][] graph){
        int V = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(i != j && graph[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        return adj;
    }

    private static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = convert(isConnected);
        boolean[] visited = new boolean[isConnected.length];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

       for (int i =0 ;i< isConnected.length;i++){
          if(!visited[i]){
              ArrayList<Integer> component =  new ArrayList<>();
              dfs(i,adj,visited,component);
              res.add(component);
          }
       }
       return res.toArray().length;

    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> component) {
        visited[i] = true;
        component.add(i);

        for(int neigh : adj.get(i)){
            if(!visited[neigh]){
                dfs(neigh,adj,visited,component);
            }
        }

    }
}
