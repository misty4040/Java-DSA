package leetcode;

import java.util.Arrays;

public class Q268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println( sort(arr));


    }

    static int sort(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] == nums.length) {
                i++;
                continue;
            }
            int correct = nums[i];
            if (nums[correct] != nums[i]) {
                swap(nums, correct, i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }


        static void swap( int[] nums, int correct, int i){
            int temp = nums[correct];
            nums[correct] = nums[i];
            nums[i] = temp;
        }
    }

