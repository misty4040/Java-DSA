package Recursion;

public class StringUppercase {
    public static void main(String[] args) {
        String s = "geeksorgeeKs";
        System.out.println(upper(s,0));
    }

    private static char upper(String s,int i) {
        if(s.charAt(i) >=65 && s.charAt(i) <=90){
            return s.charAt(i);
        }
        return upper(s,i+1);
    }
}
