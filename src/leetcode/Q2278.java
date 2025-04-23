package leetcode;

public class Q2278 {
    public static void main(String[] args) {
        String  s = "foobar";
        char letter = 'o';
        int res=percentageLetter(s,letter);
        System.out.println(res);
    }

    private static int percentageLetter(String s, char letter) {
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==letter){
                count++;
            }
        }
      double per=((double) count/ch.length)*100;
        return (int)per;
    }
}
