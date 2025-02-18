package leetcode;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Q448 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(new List[]{sort(arr)}));//1 2 3 4 7 8 2 3

    }
    static List<Integer> sort(int[] nums){
        int i=0;

        List<Integer> ar=new ArrayList<>();
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ar.add(j+1);
            }

        }
        return ar;
    }

  static void swap(int[] nums, int correct, int i) {
      int temp=nums[correct];
      nums[correct]=nums[i];
      nums[i]=temp;
    }
}
