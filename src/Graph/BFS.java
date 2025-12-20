package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
        adj.add(new ArrayList<>(Arrays.asList(0,4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        System.out.println(display(adj));
    }

    public static ArrayList<Integer> display(ArrayList<ArrayList<Integer>> list){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visitor = new boolean[list.size()];

        visitor[0] = true;
        queue.add(0);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            res.add(curr);

            for (int x : list.get(curr)){
                if (!visitor[x]) {
                    queue.add(x);
                    visitor[x] = true;
                }
             }
        }
        return res;
    }


}
