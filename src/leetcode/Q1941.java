package leetcode;

import java.util.HashMap;

public class Q1941 {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurrencesEqual(s));
    }

    private static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int value = map.get(arr[0]);
        for(int i : map.values()){
            if(i != value){
                return false;
            }
        }
        return true;
    }
}
