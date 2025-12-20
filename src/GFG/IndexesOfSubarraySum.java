package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexesOfSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,7,5};
        System.out.println(subarraySum(arr,12));
    }

    private static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0 ,end , sum = 0;

        for(end=0;end<arr.length;end++){
            sum+=arr[end];


            while(sum >target){
                sum -= arr[start++];
            }


            if(sum == target){
                list.add(start + 1);
                list.add(end  +1);
                return list;
            }

        }

        list.add(-1);
        return list;
    }
}
