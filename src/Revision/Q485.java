package Revision;

public class Q485 {
    public static void main(String[] args) {
        int[] nums ={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxs=0;

        for(int i=0;i<nums.length;i++){
          if(nums[i] ==1){
              count++;
              if(maxs<count){
                  maxs= count;
              }
          }else{
              count=0;
          }
        }


        return maxs;
    }
}
