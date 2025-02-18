package leetcode;

import java.util.Arrays;

public class Q88 {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m=1,n=1;
        merge(nums1,nums2,m,n);

    }
    static void merge(int[]nums1,int[]nums2,int m,int n){
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];

        }

        for(int j=0;j<nums1.length;j++){
            int last=nums1.length-j-1;
            int max=max(nums1,last);
            swap(max,last,nums1);

            }
        System.out.println(Arrays.toString(nums1));
        }

    static void swap(int max, int last, int[] nums1) {
        int temp=nums1[last];
        nums1[last]=nums1[max];
        nums1[max]=temp;
    }



    static int max(int[] nums1, int last) {
        int max=0;
        for(int i=0;i<=last;i++){
            if (nums1[i] > nums1[max]) {
                max=i;
            }
        }
        return max;
    }

}
