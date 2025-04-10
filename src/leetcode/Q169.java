package leetcode;

import java.util.HashMap;

public class Q169 {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int res=majorityElement(nums);
        System.out.println(res);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(var enter:map.entrySet()){
            if(enter.getValue()>nums.length/2){
                return enter.getKey();
            }
        }
        return 0;
    }
}
