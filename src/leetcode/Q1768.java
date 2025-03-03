package leetcode;

import java.util.Scanner;

public class Q1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged=new StringBuilder();
        int i=0,j=0;
        int len1=word1.length();
        int len2=word2.length();
        while(i<len1||j<len2){
            if(i<len1){
                merged.append(word1.charAt(i));
                i++;
            }
            if(j<len2){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word1=in.nextLine();
        String word2=in.nextLine();
        String word=mergeAlternately(word1,word2);
        System.out.println(word);
    }
}
