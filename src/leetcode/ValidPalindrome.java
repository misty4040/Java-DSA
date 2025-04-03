package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res=isPalindrome(s);
        System.out.println(res);
    }

    private static boolean isPalindrome(String s) {
        StringBuilder filter =new StringBuilder();

        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                filter.append(Character.toLowerCase(ch));
            }
        }
        return filter.toString().equals(filter.reverse().toString());
    }
}
