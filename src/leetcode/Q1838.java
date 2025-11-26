package leetcode;

import java.util.Arrays;

public class Q1838 {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums,k));
    }

    private static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long l=0,res=1,tot=0;
        for(int r=0;r<nums.length;r++){
            tot += nums[r];

            while((long) nums[r] * (r-l+1) - tot > k){
                tot -= nums[(int)l];
                l++;
            }

            res = Math.max(res,(r-l+1));
        }
        return (int)res;
    }

}
