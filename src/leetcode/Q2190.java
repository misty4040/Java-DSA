package leetcode;

import java.util.HashMap;

public class Q2190 {
    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        int key = 1;
        System.out.println(mostFrequent(nums,key));
    }

    private static int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == key){
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int max = -1;
        int res = 0;
        for(int i: map.keySet()){
            int n=map.get(i);
            if(n>max){
                max=n;
                res=i;
            }
        }
        return res;
    }
}
