package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q1971 {
    public static void main(String[] args) {
        int n=3,source=0,dest=2;
//        [0,1],[0,2],[3,5],[5,4],[4,3]
        int[][] edge = {
                {0,1},
                {1,2},
                {2,0}
//                {5,4},
//                {4,3}
        };

        System.out.println(validPath( n,edge, source,dest));

    }

    public static ArrayList<ArrayList<Integer>> convert(int n,int[][] edge){
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }

        for(int[] matrix : edge ) {
           int u=  matrix[0] ;
           int v = matrix[1];
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
        return adjlist;
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = convert(n,edges);
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()){
            int curr = queue.poll();
            res.add(curr);
            if(curr == destination) return true;
            for(int i : adj.get(curr)){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }
}
