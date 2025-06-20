package Revision;

import java.util.HashMap;

public class Q169 {
    public static void main(String[] args) {
        int[]  nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(var entry: map.entrySet()){
            if(entry.getValue() > (nums.length/2)){
                return entry.getKey();
            }
        }
        return 0;
    }
}
