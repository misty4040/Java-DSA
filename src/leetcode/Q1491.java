package leetcode;

import java.util.Arrays;

//public class Q1491 {
//    public static void main(String[] args) {
//        int[]arr={4000,3000,1000,2000};
//        System.out.println(Arrays.toString(sort(arr)));
//
//
//    }
//    static int[] sort(int[] nums){
//        for(int i=0;i<nums.length;i++){
//            int last=nums.length-i-1;
//            int max=max(last,nums);
//            swap(max,last,nums);
//
//        }
//
//    }
//
//   static void swap(int max, int last, int[] nums) {
//        int temp=nums[last];
//        nums[last]=nums[max];
//        nums[max]=temp;
//    }
//    static int max(int last, int[] nums) {
//        int max=0;
//        for(int i=0;i<=last;i++){
//            if(nums[i]>nums[max]){
//                max=i;
//            }
//        }
//        return max;
//    }
//
//
//}
