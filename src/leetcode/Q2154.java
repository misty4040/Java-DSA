package leetcode;

public class Q2154 {
    public static void main(String[] args) {
        int[] nums = {2,7,9};
        int original = 4;
        System.out.println(findFinalValue(nums,original));
    }

    private static int findFinalValue(int[] nums, int original) {
       int[] count = new int[1001];

       for(int i=0;i<nums.length;i++){
           count[nums[i]]++;
       }
        while(true) {
            if(original>1001){
                break;
            }
            if (count[original] >= 1) {
                original = original * 2;
            }else{
                break;
            }
        }
        return original;
    }
}
