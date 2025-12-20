package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOfGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        [0,1],[0,2],[3,5],[5,4],[4,3]
        adj.add(new ArrayList<>(Arrays.asList(0,1)));
        adj.add(new ArrayList<>(Arrays.asList(0,2)));
        adj.add(new ArrayList<>(Arrays.asList(3,5)));
        adj.add(new ArrayList<>(Arrays.asList(5,4)));
        adj.add(new ArrayList<>(Arrays.asList(4,3)));

        System.out.println(bfs(adj));
    }

    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitor = new boolean[adj.size()];

        visitor[0] = true;
        queue.add(0);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            res.add(curr);

            for (int x : adj.get(curr)) {
                if (!visitor[x]) {
                   queue.add(x);
                    visitor[x] = true;
                }
            }
        }
        return res;
    }
}
