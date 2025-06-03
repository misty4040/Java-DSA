package leetcode;

public class Q2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    private static char repeatedCharacter(String s) {
        int[] count = new int[26];

        for(char ch: s.toCharArray()){
            count[ch - 'a']++;
            if(count[ch - 'a'] >= 2){
                return ch;
            }
        }
        return ' ';
    }
}
