package leetcode;

import java.util.Arrays;

public class Q349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int[] count1 = new int[1001];
        int[] count2 = new int[1001];

        for(int i: nums1){
            count1[i]++;
        }

        for(int i: nums2){
            count2[i]++;
        }

        int[] res = new int[1001];
        int j=0;
        for(int i=0;i<1001;i++){
            if(count1[i]>=1 && count2[i]>=1){
                res[j++] = i;
            }
        }

        return Arrays.copyOfRange(res,0,j);
    }
}
