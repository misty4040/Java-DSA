package leetcode;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

        static int[] searchRange(int[] nums, int target) {



        int[] arr2=new int[2];
         arr2[0]=check(nums,target,true);
        arr2[1]=check(nums,target,false);
        return arr2;
    }

    static int check(int[] nums, int target,boolean find) {

        int fo=-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < nums[mid])
            {
                end = mid - 1;

            }
            else if(target>nums[mid])
            {
                start = mid + 1;
            }
            else{
                if(find){
                    end=mid-1;
                    fo=mid;
                }
                else{
                    start =mid+1;
                    fo=mid;
                }
            }
        }
        return fo;
    }
}