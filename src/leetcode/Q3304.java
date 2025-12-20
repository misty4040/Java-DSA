package leetcode;

public class Q3304 {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    private static char kthCharacter(int k) {

        return findword(k,"a");

    }

    private static char findword(int k, String s) {
        if(s.length() >= k){
            return s.charAt(k-1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i) == 'z'){
                sb.append('a');
            }else{
                char ch = (char)(s.charAt(i) + 1);
                sb.append(ch);
            }
        }
        s = s+sb;
        return findword(k,s);
    }


}
