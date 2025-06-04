package leetcode;

import java.util.HashMap;
import java.util.Objects;

public class Q290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String pattern, String s) {
        char[] ch = pattern.toCharArray();
        String[] arr = s.split(" ");
        if (ch.length != arr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                if (!Objects.equals(map.get(ch[i]), arr[i])) {
                    return false;
                }
            }
            map.put(ch[i], arr[i]);
        }
        return true;
    }
}
