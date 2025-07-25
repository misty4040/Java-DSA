package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                arr.add(i);
            }
        }
        return arr;
    }
}
