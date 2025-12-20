package Graph;

import java.util.Arrays;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        addEdge(mat,0,1);
        addEdge(mat,0,4);
        addEdge(mat,1,2);
        addEdge(mat,1,4);
        addEdge(mat,2,3);
        addEdge(mat,3,4);

         display(mat);
    }

    public static void display(int[][] mat){
        for(int[] matrix : mat){
            System.out.println(Arrays.toString(matrix));
        }
    }

    private static void addEdge(int[][] mat,int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1;
    }
}
