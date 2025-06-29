package Recursion;

public class Ques {
    public static void main(String[] args) {
        String s = "acdeapplegh";
        System.out.println(removeapple(s,""));
    }

    private static String removeapple(String s,String p) {
        if (s.isEmpty()) {
            return p;
        }
        char ch = s.charAt(0);
        if (s.startsWith("apple")) {
            return removeapple(s.substring(5), p);
        } else {
            return removeapple(s.substring(1), p + ch);
        }
    }
}
