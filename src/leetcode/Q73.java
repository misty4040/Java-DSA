package leetcode;

import java.util.Arrays;

public class Q73 {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));


    }

    public static void setZeroes(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;

        boolean rowzero =false;
        boolean columnzero = false;
// 0 row check kor
        for(int j=0;j<n;j++){
            if(matrix[0][j] == 0){
                rowzero = true;
                break;
            }
        }
// 0 column check kro
        for(int i=0;i<m;i++){
            if(matrix[i][0] == 0){
                columnzero = true;
                break;
            }
        }
// markers lgaynege
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0; //row
                    matrix[0][j] = 0; //column
                }
            }
        }

// markers update

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(rowzero){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }

        if(columnzero){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
