package leetcode;

public class Q709 {
    public static void main(String[] args) {
        String s = "Hello";
        String res = toLowerCase(s);
        System.out.println(res);
    }

    private static String toLowerCase(String s) {
//        String var=s.toLowerCase();
//        return var;
        char[] ch = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(ch[i]>='A'&& ch[i]<='Z') {
                char var = (char) ((char) ch[i] + 32);
                res.append(var);
            }else{
                res.append(ch[i]);
            }

        }
        return res.toString();
    }
}
