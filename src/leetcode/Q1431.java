package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1431 {//candies

    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int extra=3;

        System.out.println(Arrays.toString(new List[]{kids(arr,extra)}));

    }
    static List<Boolean> kids(int[] arr,int extra){
        int max=max(arr);
        List<Boolean> nums=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]+extra<max){
               nums.add(false);
            }
            else{
               nums.add(true);
            }
        }
return nums;
    }

    static int max(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

}
