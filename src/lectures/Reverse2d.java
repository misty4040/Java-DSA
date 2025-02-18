package lectures;

public class Reverse2d {
    public static void main(String[] args) {
        int[][] mat = {
                {7, 3, 1, 9},
                {3, 4, 6, 9},
                {6, 9, 6, 6},
                {9, 5, 8, 5}
        };

        for(int i=0;i<mat.length;i++){
            int a=mat[0].length-1;
            for(int j=0;j<mat[i].length/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][a];
                mat[i][a]=temp;
                a--;
            }

        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            }
    }
}


