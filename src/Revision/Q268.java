package Revision;

import java.util.Arrays;

public class Q268 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        int i=0;
        if(n==1 && nums[0] != 0){
            ans =0;
        }else {
            for (int j = 0; j < n; j++) {
                if (nums[j] != i++) {
                    ans = j;
                    break;
                }
                if (j == n - 1 && ans == 0) {
                    ans = n;
                }
            }
        }
        return ans;
    }
}
