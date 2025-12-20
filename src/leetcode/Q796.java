package leetcode;

public class Q796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }

    private static boolean rotateString(String s, String goal) {

        for(int i=0;i<s.length();i++){
            s=swap(s);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }

    private static String swap(String s){
        char[] ch = s.toCharArray();
        char temp = ch[0];
        for(int i=1;i<s.length();i++){

            ch[i-1] = ch[i];
        }
        ch[ch.length-1] = temp;

        String s1 = new String(ch);
        return s1;
    }

}
