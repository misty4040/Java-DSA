package leetcode;

import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        System.out.println(Arrays.toString(arraysum(nums)));

    }
    static int[] arraysum(int[] nums){
        int sum=0;

        int temp=nums[0];
        sum=temp;
        for(int i=1;i<nums.length;i++){


            sum+=nums[i];
            nums[0]=temp;
            nums[i]=sum;
        }
        return nums;



    }
}
