package DSA;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={5,3,4,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int last=nums.length-i-1;
            int max=max(nums,last);
            swap(nums,last,max);
        }

    }

    static void swap(int[] nums,int last, int max) {
        int temp=nums[last];
        nums[last]=nums[max];
        nums[max]=temp;

    }

    static int max(int[] nums,int last){
        int max=0;
        for(int i=0;i<=last;i++){
            if(nums[i]>nums[max]) {
                max = i;
            }
        }
        return max;
    }

}
