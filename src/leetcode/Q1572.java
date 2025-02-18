package leetcode;

import java.util.Arrays;

public class Q1572 {
    public static void main(String[] args) {//sum of diagonal elements
        int[][] arr = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };
        System.out.println(diagonalsum(arr));
    }

    static int diagonalsum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            int a=mat[0].length-1;
            for(int j=0;j<mat[i].length/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][a];
                mat[i][a]=temp;
                a--;
            }

        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j) {
                    sum += mat[i][j];
                }
            }
        }
        int n = mat.length;
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
            return sum;
        }
        return sum;
    }
}


