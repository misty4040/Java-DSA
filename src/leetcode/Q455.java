package leetcode;

import java.util.Arrays;

public class Q455 {
    public static void main(String[] args) {
        int[] g ={1,2,3}; //7 8  9 10
        int[] s ={1,2}; // 1 2 3
        System.out.println(findContentChildren(g,s));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int start = 0 ,end = 0;
        while(start<g.length && end<s.length) {
            if (s[end] >= g[start]) {
                count++;
                start++;
            }
            end++;
        }

        return count;
    }
}
