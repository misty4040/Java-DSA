package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q884 {
    public static void main(String[] args) {
        String  s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));
    }

    private static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String s3 = s1 +" "+ s2;
        String[] arr = s3.split(" ");
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (String ch : arr) {
            if (map.get(ch) == 1) {
                list.add(ch);
            }
        }

        String[] arr2 = new String[list.size()];

        for(int i=0; i<arr2.length;i++){
            arr2[i] = list.get(i);
        }
        return arr2;
    }
}
