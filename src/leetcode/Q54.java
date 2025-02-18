package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q54 {
    public static void main(String[] args) {
        int[][] nums= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(new List[]{SpiralOrder(nums)}));
    }
    static List<Integer> SpiralOrder(int[][] matrix){
        int rs=0,cs=0;
        int re=matrix.length-1,ce=matrix[0].length-1;
        List <Integer> nums2= new ArrayList<>();
        while(rs<=re &&cs<=ce) {
            if (rs <= re && cs <= ce) {
                for (int i = cs; i <= ce; i++) {
                    nums2.add(matrix[rs][i]);
                }
            }
            rs++;
            if (rs <= re && cs <= ce) {
                for (int i = rs; i <= re; i++) {
                    nums2.add(matrix[i][ce]);
                }
            }
            ce--;
            if (rs <= re && cs <= ce) {
                for (int i=ce;i>=cs;i--) {
                    nums2.add(matrix[re][i]);
                }
            }
            re--;

            if (rs <= re && cs <= ce) {
                for (int i = re; i >= rs; i--) {
                    nums2.add(matrix[i][cs]);
                }
            }
            cs++;
        }
        return nums2;

    }
}
