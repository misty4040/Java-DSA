package leetcode;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        int start =0,maxs=0;

        for(int end=0;end<ch.length;end++){
            if(set.add(ch[end])){
                set.add(ch[end]);
                maxs = Math.max(maxs,end-start+1);
            }else{
                while(ch[start]!=ch[end]){
                    set.remove(ch[start++]);
                }
                set.remove(ch[start++]);
                set.add(ch[end]);
            }
        }
        return maxs;

    }
}
