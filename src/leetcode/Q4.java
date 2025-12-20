package leetcode;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge= new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            merge[j]=nums1[i];
            j++;
        }

        for(int i=0;i<nums2.length;i++){
            merge[j]=nums2[i];
            j++;
        }

        Arrays.sort(merge);
        int n= merge.length/2;
        if(merge.length%2!=0){

            return (double)merge[n];
        }else{
            return (double)(merge[n]+merge[n+1])/2;
        }
    }
}
