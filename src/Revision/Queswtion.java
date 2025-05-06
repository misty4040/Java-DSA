package Revision;

import java.util.HashMap;

public class Queswtion {
    public static void main(String[] args) {
        String s="aabcdde";
        System.out.println(find(s));
    }

    static int find(String s) {
        char[] ch=s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : ch) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int freq = map.get('a');
        return freq;

    }
}
