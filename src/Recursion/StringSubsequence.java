package Recursion;

public class StringSubsequence {
    public static void main(String[] args) {
        makesub("","abc");
    }

    private static void makesub(String p, String s) {
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);

        makesub(p+ch,s.substring(1));
        makesub(p,s.substring(1));
    }
}
