package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Q2465 {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));
    }

    private static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int first=0;
        int last = nums.length-1;
        double avrg=0;
        HashSet<Double> set = new HashSet<>();

        while(first<last){
           avrg = (double) (nums[first++]+ nums[last--])/2;
           set.add(avrg);
       }
        return set.size();
    }
}
