package leetcode;

public class Q521 {
    public static void main(String[] args) {
        String a = "aba", b = "cdc";
        int res=findLUSlength(a,b);
        System.out.println(res);
    }

    private static int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }

        return Math.max(a.length(),b.length());
    }
}
