package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Q136 {
    public static void main(String[] args) {
        int[] nums={2,2,1};
        int res=singleNumber(nums);
        System.out.println(res);
    }

    private static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(var num:map.entrySet()){
            if(num.getValue()==1){
                return num.getKey();
            }
        }
        return 0;
    }
}
