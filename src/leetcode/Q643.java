package leetcode;

public class Q643 {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double maxs = 0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxs = (double)sum/k;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i] - nums[i-k];
            maxs = Math.max((double) sum/k , maxs);
        }
        return maxs;

    }
}
