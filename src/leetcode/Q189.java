package leetcode;

import java.util.Arrays;

public class Q189 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        rotate(nums,3);
    }

    private static void rotate(int[] nums, int k) {

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }

    public static void reverse(int[] nums,int start,int end){
            while(end>start){
                int temp=nums[start];
                nums[start++] = nums[end];
                nums[end--] =temp;
            }
    }
}
