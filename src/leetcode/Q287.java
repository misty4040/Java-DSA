package leetcode;

public class Q287 {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(sort(arr));

    }
    static int sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }
        return nums[nums.length-1];

    }

    static void swap(int[] nums, int correct, int i) {
        int temp=nums[correct];
        nums[correct]=nums[i];
        nums[i]=temp;
    }
}
