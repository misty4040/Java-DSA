package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Q2053 {
    public static void main(String[] args) {
        String arr[] = {"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr,k));
    }

    private static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

      int distinct =1;
        for(String var : arr){
            if(map.get(var) == 1){
                if(distinct == k){
                    return var;
                }else{
                    distinct++;
                }
            }
        }
        return "";
    }
}
