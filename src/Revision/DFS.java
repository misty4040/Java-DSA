package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
        adj.add(new ArrayList<>(Arrays.asList(0,1,4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        System.out.println(dfs(adj));

    }

    private static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfsgraph(adj , visited,0,res);
        return res;
    }

    private static void dfsgraph(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i, ArrayList<Integer> res) {
        visited[i] = true;
        res.add(i);

        for(int arr : adj.get(i)){
            if(!visited[arr]){
                dfsgraph(adj,visited,arr,res);
            }
        }
    }
}
