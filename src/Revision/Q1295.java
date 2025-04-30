package Revision;

public class Q1295 {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count=0,even=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            count=0;
            while(n!=0){
                count++;
                n=n/10;

            }

            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}
