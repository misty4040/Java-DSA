package Graph;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 3;
        int[][] mat =  {
                {0,1},
                {0,2},
                {1,2}
        };

        display(adj,mat,V);
    }

    public static void display(ArrayList<ArrayList<Integer>> list ,int[][] mat ,int V){
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }

        for(int[] matrix : mat){
            int u = matrix[0];
            int v = matrix[1];

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for(ArrayList<Integer> arr : list){
            System.out.println(arr);
        }

    }
}
