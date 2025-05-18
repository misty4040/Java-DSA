package leetcode;

import java.util.HashSet;

public class Q2062 {
    public static void main(String[] args) {
        String  word = "cuaieuouac";
        System.out.println(countVowelSubstrings(word));
    }

    private static int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<>();
        int count=0;

        for(int i=0; i<word.length()-4; i++){
            set.clear();
            for(int j=i; j<word.length(); j++){
                char ch=word.charAt(j);
                if("aeiou".contains(String.valueOf(ch))){
                    set.add(ch);
                    if(set.size()==5){
                        count++;
                    }
                }else{
                    break;
                }
            }
        }
        return count;
    }
}
