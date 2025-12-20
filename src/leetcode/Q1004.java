package leetcode;

public class Q1004 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }

    private static int longestOnes(int[] nums, int k) {
        int start =0 , maxlen = 0, zerocount = 0;

        for(int end =0;end<nums.length;end++){
            if(nums[end] == 0){
                zerocount++;
            }

            while(zerocount>k){
                if(nums[start] == 0){
                    zerocount--;
                }
                start++;
            }

            maxlen = Math.max(maxlen,end - start +1);
        }
        return maxlen;
    }
}
