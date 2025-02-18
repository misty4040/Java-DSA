package leetcode;


import java.util.Arrays;

public class Q1929 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(concatenate(nums)));


    }
    static int[] concatenate(int[] nums){
        int[] nums2=nums;
        int a=nums.length;
        int b=2*a;
        int[] ans= new int[b];
        for(int i=0;i<a;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<a;i++){
            ans[a+i]=nums2[i];
        }
        return ans;


    }
}
