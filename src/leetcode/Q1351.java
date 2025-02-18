package leetcode;

public class Q1351 {
    public static void main(String[] args) {//find the negative num
        int[][] grid={{4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(negative(grid));
    }
    static int negative(int[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;

    }

}
