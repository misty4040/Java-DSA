package leetcode;

import java.util.Arrays;
import java.util.List;

public class Q75 {//Dutch National Flag Alogorithm
    public static void main(String[] args) {
        int [] arr={0,1,2,2,1,0,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=0;
       while(mid<=end){
           switch(nums[mid]){
               case 0:
                   int temp=nums[mid];
                   nums[mid]=nums[start];
                   nums[start]=temp;
                   start++;
                   mid++;
                   break;
               case 1:
                   mid++;
                   break;
               case 2:
                   temp=nums[mid];
                   nums[mid]=nums[end];
                   nums[end]=temp;
                   end--;
                   break;

           }



        }
    }
}
