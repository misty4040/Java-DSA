package leetcode;

public class Q2206 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }

    private static boolean divideArray(int[] nums) {
        int[] count = new int[501];

        for(int i :nums){
            count[i]++;
        }

        for(int i :nums){
            if(count[i] %2 !=0){
                return false;
            }
        }
        return true;
    }
}
