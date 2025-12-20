package Revision;

import java.util.HashMap;

public class Q136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int ans=0;
        for(int i :nums){
            ans^=i;
        }
        return ans;


//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i:nums){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//
//        for(int i : map.keySet()){
//            if(map.get(i) == 1){
//                return i;
//            }
//        }
//        return 0;


    }


}
