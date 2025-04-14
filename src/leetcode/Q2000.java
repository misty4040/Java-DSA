package leetcode;

public class Q2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String res=reversePrefix(word,ch);
        System.out.println(res);
    }

    private static String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        String str1=word.substring(0,index+1);
        String str2=word.substring(index+1,word.length());

        StringBuilder res= new StringBuilder(str1);
        res.reverse();
        res.append(str2);
        return res.toString();
    }
}
