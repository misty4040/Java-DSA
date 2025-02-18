package lectures;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},//0th index
                {5,6,7},//1st index
                {9,0,1,2,3},//2nd index
        };
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){//arr[row] means 0th or any index length
                System.out.print(arr[row][column]+ " ");
            }
            System.out.println();
        }
    }

}
